package Lesson;

public class Lesson_9_PrintFormat {
    public static void main(String[] args) {

        //форматированный вывод System.out.printf

        int a = 5;
        int b = 15;

        System.out.println("a = "+a +";b = "+b);
        System.out.printf("a = %d;b = %d",a,b); // это форматированный вывод
        // %d -  спецификатор для вывода целочисленных значений
        // %с - для вывода символа
        // %s - для вывода строки
        // %f -  для вывода чисел с плавающей точкой

        String name = "John";
        int age = 25;
        float salary = 3000.76444f;

        System.out.printf("\tname: %s, age: %d, salary: %.2f",name,age,salary);


        // ТИП Конвертации значений

        int i;
        float f;

        i = 25;

        f = i;
        System.out.println(f);

        /*
        Для автоматического преобразования типов должны выполняться два условия:
        1. Типы должны быть совместимы
        2. Тип в который происходит преобразование должен быть больше типа из которого
        происходит преобразование
         */

    }
}
