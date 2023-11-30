package Lesson;

public class Lesson_4_Maht_class {
    public static void main(String[] args) {

        //учим клас Maht:

        // abs - значение по модулю ( т.е. абсолютное значение без учета знака)
       int abs1 = Math.abs(10);
       System.out.println(abs1);

        int abs2 = Math.abs(-10);
        System.out.println(abs1);

        // min, max - выводит наименьшее или наибольшее значение из заданых данных

        int a = 1;
        int b = 3;

        int min = Math.min(a,b);
        System.out.println(min);

        int max = Math.max(a,b);
        System.out.println(max);

        // round - округление до целого числа
        double round1 = Math.round(34.236);
        double round2 = Math.round(45.765);
        System.out.println(round1);
        System.out.println(round2);

        // random - генерировать случайное число от 0 до 1

        double rand = Math.random();
        System.out.println(Math.random());
        //если надо больше число , то можно умножить на пример на 1000
        System.out.println(Math.random()*1000);

        // pow - возведение в степень
        System.out.println(Math.pow(2,3)); // тут 2 возводим в третью степень

        // sqrt - извлечение из степени
        System.out.println(Math.sqrt (16));

        // число ПИ PI = 3.14
        System.out.println(Math.PI);





    }
}
