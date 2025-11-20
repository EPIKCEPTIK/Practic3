package org.example;

public abstract class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Помилка: Ділення на нуль неможливе!");
        }
        return a / b;
    }

    public static double sqrt(double a) throws InvalidInputException {
        if (a < 0) {
            throw new InvalidInputException("Помилка: Не можна добути корінь з від'ємного числа!");
        }
        return Math.sqrt(a);
    }

    public static double calculate(double a, double b, String operator) throws InvalidInputException {
        switch (operator) {
            case "+": return add(a, b);
            case "-": return subtract(a, b);
            case "*": return multiply(a, b);
            case "/": return divide(a, b);
            case "sqrt": return sqrt(a);
            default: throw new InvalidInputException("Помилка: Невідома операція '" + operator + "'");
        }
    }
}