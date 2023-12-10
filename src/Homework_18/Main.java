package Homework_18;

public class Main {
    public static void main(String[] args) {

        /*
        Задача 1
        Создать класс Student c полями (переменными) имя и возраст.
        Создать несколько обьектов этого класса. Вывести их на печать
         */

        Student student1 = new Student("Vasiliy", 27 );
        student1.list();

        Student student2 = new Student("John", 45);
        student2.list();


        /*
        Задача 2
        Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина, конструктор и методы
        для подсчета площади и периметра прямоугольника. В классе Main создать несколько обьектов класса Rectangle
        и вывести на экран площадь и периметр каждого
         */

        Rectangle rectangle1 = new Rectangle(2.5 , 3.2);
        rectangle1.square(); rectangle1.perimeter();

        Rectangle rectangle2 = new Rectangle(2.5 , 2.5);
        rectangle2.square(); rectangle2.perimeter();






    }
}
