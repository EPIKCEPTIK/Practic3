package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean keepRunning = true;
        System.out.println("--- Калькулятор Java (Static) ---");

        while (keepRunning) {
            try {
                System.out.print("\nВведіть перше число: ");
                double num1 = scanner.nextDouble();

                System.out.print("Введіть операцію (+, -, *, /, sqrt): ");
                String operator = scanner.next();

                double result = 0;
                double num2 = 0;

                if (!operator.equals("sqrt")) {
                    System.out.print("Введіть друге число: ");
                    num2 = scanner.nextDouble();
                }

                result = Calculator.calculate(num1, num2, operator);

                System.out.printf("Результат: %.2f\n", result);

            } catch (ArithmeticException | InvalidInputException e) {
                System.out.println(">>> " + e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(">>> Помилка: Введено некоректні дані.");
                scanner.next();
            } finally {
                System.out.println("[Запит оброблено]");
            }

            System.out.print("Продовжити? (y/n): ");
            String answer = scanner.next();
            keepRunning = answer.equalsIgnoreCase("y");
        }
        scanner.close();
    }
}