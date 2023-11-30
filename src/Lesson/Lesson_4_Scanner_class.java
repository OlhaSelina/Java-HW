package Lesson;

import java.util.Scanner;

public class Lesson_4_Scanner_class {
    // ввод (чтение ) с клавиатуры с помощью Сканера
    public static void main(String[] args) {

        // надо сначала создать новый  Сканер
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = myScanner.nextLine();
        System.out.println("You entered name " + name);

        System.out.println("Enter a Surname");
        String secondName = myScanner.nextLine();

        System.out.println("The name is " + name + " " + secondName);

        System.out.println("Enter your age");
        int age = myScanner.nextInt();

        System.out.println("The name is " + name + " " + secondName + " age is " + age);

        myScanner.close();
    }
}
