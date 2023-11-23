package Homework;

public class Main_HW4_2 {
    public static void main(String[] args) {

        /*    Задание 2
        Написать программу, выводящую на экран ASCII значение символа.
Пример: 'А' результат - 65
         */


        char ch;
        ch = 'A';
        System.out.println("result: " + ch);

        ch = 78;
        System.out.println("result: " + ch);

        // это указываем программе, что надо искать в таблице ASCII обратное значени ( А под
        // номером 65) и мы просим показать номер под которім находится А в таблице
        int intCh = 'A';
        System.out.println(intCh);
    }
}