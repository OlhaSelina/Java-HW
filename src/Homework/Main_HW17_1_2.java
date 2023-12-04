package Homework;

import java.util.Arrays;

public class Main_HW17_1_2 {

     /*
    Написать метод принимающий две строки и проверяющий является ли одна строка анограммой( переставлені букві
    в любой последовательности) другой.
    метод возвращает boolean

    toCharArray , Arrays.sort

     */

    /*
    Написать метод, принимающий строку и целое число(индекс) и возвращающий строку без символа, находящегося по этому индексу.

Пример:
int index = 3
String str = "Hello"

public static String removeCharAtIndex( String str, int index) -> "Helo"
     */

    public static void main(String[] args) {

        System.out.println(anogramma("qwerty", "yertwq"));
        System.out.println(anogramma("qwerty", "sgff"));

        System.out.println(removeCharAtIndex("Hello", 3));


    }

    public static boolean anogramma(String str1, String str2) {
        /*
        строку перевести в массив , затем отсортировать
         */
        /* мой вариант не работает

        char[] str1New = str1.toCharArray();
        char[] str2New = str2.toCharArray();
        Arrays.sort(str1New);
        Arrays.sort(str2New);
        String.valueOf(str1New);
        String.valueOf(str2New);
        boolean result;

        if ( str1New.equals(str2New) ){

            if ( str1New == str2New) {

                return true;

            }
            else{
                return false;
            }


        }

        return result;

         */

        if (str1.length() != str2.length())
            return false;

        char[] str1New = str1.toCharArray();
        char[] str2New = str2.toCharArray();

        Arrays.sort(str1New);
        Arrays.sort(str2New);

        for (int i = 0; i < str1New.length; i++) {
            if (str1New[i] != str2New[i])
                return false;

        }
        return true;
    }


    // 2 Задача

    public static String removeCharAtIndex(String str, int index) {

        return str.substring(0,index) + str.substring(index+1);
        // return str.substring(0,index) + '*' + str.substring(index+1); тут вместо символа вставили звездочку

    }


}

