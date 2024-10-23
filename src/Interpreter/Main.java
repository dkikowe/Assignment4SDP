package Interpreter;

import Interpreter.Interpreter;

public class Main {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
        String expression = "5 + 23";
        try {
            int result = interpreter.interpret(expression);
            System.out.println("Result: " + result); // Ожидаемый результат: 4
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
