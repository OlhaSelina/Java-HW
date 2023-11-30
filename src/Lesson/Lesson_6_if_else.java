package Lesson;

import java.util.Scanner;

public class Lesson_6_if_else {
    public static void main(String[] args) {
        // If statement
        /* if ( condition 1) {
               statement;
            }
           else {
              statement;

               if (condition 2)вложеный
                 statement;
               else
                 statement;
           }
         */
        if (5 < 6) {
            System.out.println("5 is less than 6");
        }

        int num = 101;
        if (num <= 100) {
            System.out.println("num <= 100");
        }
        else {
            System.out.println("num > 100");
        }

        // вложеный if
        int num1 = 60;
        if (num1 < 100) {
            System.out.println("number is less 100");
        }
            if (num1 > 40){
                System.out.println("number is greater then 40");
            }



    /* Игра! Угадай число. Игрок должен угадать число задуманное программой секретное число
    введя его с клавиатуры
     */
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;

        System.out.println("Guess a number between 0 and 9");
        int answer = scanner.nextInt();

        if (answer == secretNumber) {
            System.out.println("You are right! You have guessed the secret number");
        }
        else {
            //System.out.println("You are don't right!");
            System.out.print("Sorry, the number  ");

            //  вложенный if
            if( answer < secretNumber)
                System.out.println("is too small");
            else System.out.println("is too big");
        }
        scanner.close();


        // Пример вложеных if

        int x = 7;

        if( x == 1) {
            System.out.println("x = 1");
        }
        else if( x == 2) {
            System.out.println("x = 2");
        }
        else if ( x == 3) {
            System.out.println("x = 3");
        }
        else if ( x == 4) {
            System.out.println("x = 4");
        }
        else {
            System.out.println(" x is not between 1 and 4");
        }

        System.out.println("if-else is finished");


        //  Определить количество цифр положительного числа
        // 1234

        int i = 1367;

        if(i < 10 && i >= 1 ){
            System.out.println("It is a one digit number");
        }
        else if (i < 100 && i >= 10){
            System.out.println("It is a two-digit number");
        }
        else if(i < 1000 && i >= 100){
            System.out.println("It is a three-digit number");
        }
        else{
            System.out.println("The number has  more than 3 digits");
        }

        /* Написать программу, определяющую является ли введенное с клавиатуры целое число
        положительным, отрицательным, или нулем. Программа выводит результат на экран
          Number is positive
        Number is negative
        Number is zero
         */

        Scanner Scan = new Scanner(System.in);
        System.out.println(" Enter number");
        int num2 = Scan.nextInt();

        if (num2 < 0){
            System.out.println("Number is negative");
        }
        else if (num2 > 0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}
