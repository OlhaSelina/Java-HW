package Homework;

import java.util.Scanner;

public class Main_HW4_1 {
    public static void main(String[] args) {
        /* Задание 1
        Написать программу, которая принимает с клавиатуры имя ,
        фамилию и возраст (Ваши или воображаемого персонажа) и выводит в консоль
        эту информацию в следующем виде:
         */

        Scanner myScan = new Scanner(System.in);
        System.out.println("First name: ");
        String name = myScan.nextLine();
        System.out.println("Last name: ");
        String lastname = myScan.nextLine();
        System.out.println("Age: ");
        int age = myScan.nextInt();
        System.out.println("First name: " + name + " Last name: " + lastname + " Age: " + age);
        myScan.close();





    }

}




