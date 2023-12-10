package Homework_19;

public class Main {

    /* Задача 1
    Создать класс Temperature (температура), содержащий метод для перевода градусов по фаренгейту в градусы цельсия
    ( celsius = 5*(farenheit - 32)/9). В классе Main создать несколько обьектов класса Temperature
    (значение температуры по фаренгейту должно задаваться через конструктор) и вывести результат перевода на экран

     */

    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        temperature.celsius();

        Temperature_v2 temperature2 = new Temperature_v2(432);
        System.out.println(temperature2.farenheit2 + "  градусов по Фаренгейту равно:  " + temperature2.farenheitToCelsius() + " градусов по Цельсию" );

    }
}
