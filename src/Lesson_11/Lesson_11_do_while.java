package Lesson_11;

import java.util.Scanner;

public class Lesson_11_do_while {
        // do-while оценка истинности или ложности проверяется в конце цикла.

    /*
    do
    {
    statements
    } while ( condition)
     */
    public static void main(String[] args) {
        exemple();

        int i = 10;

        do {
            System.out.println(i);
            i--;
        } while ( i > 1);
    }
    static void exemple(){
        Scanner scanner = new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter a letter/ q to quit");
            ch = scanner.next().charAt(0);

            System.out.println("You have entered  " + ch);
        } while (ch != 'q');
    }
}

