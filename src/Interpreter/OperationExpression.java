package Interpreter;

public class OperationExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    private char operator;

    public OperationExpression(Expression leftExpression, Expression rightExpression, char operator) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operator = operator;
    }

    @Override
    public int interpret() {
        if (operator == '+') {
            return leftExpression.interpret() + rightExpression.interpret();
        } else if (operator == '-') {
            return leftExpression.interpret() - rightExpression.interpret();
        } else {
            throw new UnsupportedOperationException("Неподдерживаемый оператор: " + operator);
        }
    }
}
