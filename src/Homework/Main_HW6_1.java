package Homework;

public class Main_HW6_1 {
    public static void main(String[] args) {

        /*
        Есть две переменные целого типа. Написать программу, выводящую на экран сумму их значений,
        а в том в случае, если эти числа равны, должна выводиться двойная сумма.
Пример: 1 + 2 -> 3
3 + 2 -> 5
2 + 2 -> 8
         */

        int x = 3;
        int y = 3;
        if (x == y){
            System.out.println((x + y) * 2);
        }
        else
        {
            System.out.println(x +y);
        }

        /* Есть три переменные целого типа. Написать программу, которая сравнивает эти числа и
        выводит на экран результат:

        All numbers are equal если они равны
        All numbers are different если все они все разные
        Some numbers are equal если какие-то из них равны
       */
        int a = 1;
        int b = 1;
        int c = 3;

        if ((a == b) && (b == c) && (c == a)) {
            System.out.println("All numbers are equal");
        }
        else if ((a != b) && (b !=c) && (c != a)) {
            System.out.println("All numbers are different");
        }
        else System.out.println("Some numbers are equal");


    }
}
