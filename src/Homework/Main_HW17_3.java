package Homework;



/*
   ЗАДАЧА 3
   Написать свой собственный метод substring, работающий аналогично методу в Джаве. Метод принимает строку , индексы начала и конца и возвращает подстроку.
String mySubstring( String string, int begin, int end).
 */

public class Main_HW17_3 {

    public static void main(String[] args) {

        System.out.println(mySubstring("Hello Word", 1, 3));


    }
    public static String mySubstring(String str, int begin, int end){

        String res = "";
        for(int i = begin; i < str.length() && i < end; i++ ){
            res = res + str.charAt(i);
        }
        return  res;

    }
}
