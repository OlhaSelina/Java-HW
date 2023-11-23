package Homework;

import java.util.Scanner;

public class Main_HW7_1 {
    public static void main(String[] args) {

        /*
        Напишите метод калькулятор, который в зависимости от ввода пользователя выполняет сложение,
         вычитание, умножение или деление. Пользователь вводит оба числа, затем знак
         операции (+, -, * или /). В зависимости от введенного знака программа выполняет
          выбранное действие и выводит полученный результат на экран. При написании метода
           используйте Switch.
         */

        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        System.out.println("Enter first numer: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();

        String trash = scanner.nextLine(); // это чтоб убрать мусор из кэша. иногда без него не получается ввести следующее значение
        System.out.println("trash is" + trash);

        System.out.println("Enter operator (+,-,/,*)");
        String operator = scanner.nextLine(); // первый вариант вывода символа
       // char operator = scanner.next(); // второй вариант вывода символа

        switch (operator){
            case "+":
                System.out.println(num1 + " " + operator + " " + num1 + "= " + (num1 + num2) );
                break;

            case  "-":
                System.out.println(num1 + " " + operator + " " + num1 + "= " + (num1 - num2));
                break;

            case "/":
                if (num2 == 0){
                    System.out.println("Division by zero is forbidden");
                    break; // либо убрать break и добавить перед System - else
                }
                // else
                System.out.println(num1 + " " + operator + " " + num1 + "= " + (num1 / num2));
                break;

            case  "*":
                System.out.println(num1 + " " + operator + " " + num1 + "= " + (num1 * num2));
                break;

            default:
                System.out.println("You have entered not valid operator");
        }

    }
}
