package Homework;

public class Main_HW13_1_und_2 {

    /*
    Задача 1
    -Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
    -Вывести созданный массив на экран используя цикл for.
    -Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить первому элементу значение Kiwi)
    -Вывести измененный массив на экран используя цикл for.
    Задание можно выполнить непосредственно в методе main, не создавая отдельный метод.
     */
    public static void main(String[] args) {
        String[] fruits = new String[]{"Orange", "Apple", "Banana", "Mango"};
        //System.out.println(fruits[0]);


       for ( int i = 0 ; i < 4; i++ ){
            System.out.println(fruits[i]);

        }

        System.out.println("Replace first element");

       fruits[0] = "Kiwi";

        for ( int i = 0 ; i < 4; i++ ){
            System.out.println(fruits[i]);

        }

        System.out.println();

        /* Задача 2

        Используя цикл for вывести на экран все четные элементы массива fruits из первой задачи.
        Задание можно выполнить непосредственно в методе main либо создать отдельный метод.
         */


        for ( int i = 0 ; i < 4; i++ ){
            if (i%2 == 0) {
                System.out.println(fruits[i]);
            }

        }








    }
}
