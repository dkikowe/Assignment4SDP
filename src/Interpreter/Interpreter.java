package Interpreter;

import java.util.Stack;

public class Interpreter {
    public int interpret(String expression) {
        Stack<Expression> stack = new Stack<>();
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isOperator(token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Недостаточно операндов для операции: " + token);
                }
                Expression right = stack.pop();
                Expression left = stack.pop();
                char operator = token.charAt(0);
                stack.push(new OperationExpression(left, right, operator));
            } else {
                try {
                    int number = Integer.parseInt(token);
                    stack.push(new NumberExpression(number));
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Неверный формат числа: " + token);
                }
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Некорректное выражение.");
        }

        return stack.pop().interpret();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-");
    }
}
