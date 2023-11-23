package Homework;

import java.util.Scanner;

/* ЗАДАЧА 1
Написать метод, определяющий является ли целое число положительным,
отрицательным или нулем. Метод принимает целое число в качестве параметра и
возвращает соответствующую строку. В методе main вывести результат на экран
 */

public class Main_HW9_1 {
    public static void main(String[] args) {


        Scanner myScann = new Scanner(System.in);
        System.out.println("Enter numer: ");
        int num1 = myScann.nextInt();

        System.out.println(output(num1));

    }

         public static String output(int num) {


             if (num < 0){

                 return "Number is negative";
             }
             else if (num > 0){
                 return "Number is positive";
             }
            else {
                 return "Number is zero";
            }


        }

}

