package Homework;

import java.util.Locale;

public class Main_HW16 {
    /* Задача 1
    Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
Пример: Hello -> 10
     */
    /* Задача 2
    Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе, но без первых букв
     и в верхнем регистре.
    Пример: "Hello", "There" -> ELLOHERE

     */

    /*
    Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки первой буквой.
Примет: abcd -> bcda
     */
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "There";
        String str3 = "abed";
        int len = str.length();
        System.out.println(len * 2); // ЗАДАЧА 1

        String strNew = str.substring(1);
        String str2New = str2.substring(1);
        String resConcat = strNew.concat("").concat(str2New);
        System.out.println(resConcat.toUpperCase(Locale.ROOT)); // ЗАДАЧА 2


        char[] str3New = str3.toCharArray();
        System.out.println(str3.substring(1) + str3New[0]); // ЗАДАЧА 3








    }




}
