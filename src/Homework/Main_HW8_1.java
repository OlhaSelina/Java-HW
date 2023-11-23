package Homework;

public class Main_HW8_1 {
    public static void main(String[] args) {
        double r = 2.5;

        // double res = calculateArea(r); // результат в формате double
        int res = (int) calculateArea(r); // результат в формате int (целое число)
        System.out.println(res);
        //  System.out.println( calculateArea(r) ); - вывести полученный результат

        double radius = r;
        //    System.out.println(Math.PI * radius * radius);

        double fahrenheit = 451.0;
        System.out.println(fahrenheit + "F ->" + convertToCelsius(fahrenheit) + "C");

        //форматированный вывод System.out.printf

    }

    /*
   Задача 1
Написать метод, считающий площадь круга и возвращающий это значение в основную программу.
Формула для расчета площади area = pi* radius * radius
Значение радиуса должно передаваться как аргумент метода.
Затем, в методе main вывести полученное значение на экран
    */
    static double calculateArea( double radius){

        double area = Math.PI * radius * radius;

        return Math.round(area);
    }

    /*
    Задача 2
Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы Цельсия по формуле
С = 5*(F-32)/9. Значение градусов Фаренгейта должно передаваться как аргумент метода.
Метод должен возвращать полученное значение в основную программу.
Затем, в методе main вывести полученное значение на экран.
     */

    static double convertToCelsius( double fahrenheit){

        double celsius = 5 *(fahrenheit -32.0)/9.0;

        return celsius;
    }
}
