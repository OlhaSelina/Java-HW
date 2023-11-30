package Lesson;

public class Lesson_5_boolean {
    public static void main(String[] args) {

        //  тип Boolean  - имеет два значения :  true, false

        boolean b; //  выбрали тип для переменной
        b = false; // присвоили значение переменной
        System.out.println( "b is " + b);  // вывели значение

        b = true;
        System.out.println( "now b is " + b);

        // Relational and Logical operators
        // Операторы сравнения и логические операторы

        /* Операторы сравнения
           == равенство
           != не равно
           >  больше
           <  меньше
           >= больше равно
           <= меньше равно

        */

        int i = 10;
        int k = 10;
        boolean result = i == k; // - проверяем этот оператор - результат true
        result = i != k; // false
        result = i > k;  // false
        result = i < k; // false
        result = i >= k; // true
        System.out.println(result); // выводит значение true если они одинаковые или false если значения были разные

        /* логические операторі
        & - AND  (И) как будто умножаем значение 0(f) и 1(t)
        | - OR   (ИЛИ)  как будто складываем значения
        ! - NOT  (НЕ)   если не первое значение, то значит второе.
        ^ - XOR  ( исключающее ИЛИ) если операторы одинаковые, то значение - false,
                                    если операторы разные , то значение - true


         */

        boolean p = true;
        boolean q = false;
        System.out.println(p&q);  // false

        /* операторы И и ИЛИ записанные в двойном варианте,
        то тогда программа не будет проверять второе значение если результат ясен изначально


        && - если false ,то не будет дальше проверять. если true - , то будет проверять второе значение - так как там разный будет результат
        ||  - если true ,то не будет дальше проверять. если false - , то будет проверять второе значение - так как там разный будет результат
         */


         int n , d;
         n = 10;
         d = 2;
        System.out.println( n % d == 0); // проверяем можно ли поделить без остатка. если результат true, то это да

        if ( d != 0 && (n % d == 0)){
            System.out.println( " Can be divided without remainder");
        } // сделали проверку, что d не равно 0 и что делятся без остатка , если обе части true, то вывести строку
         // если бы результат был бы false, то дальше код не выполняется.


        // Примеры:
        /*
        Джон спит днем если он не работает или у него отпуск. Переменная weekDay ( рабочий день) = true  если это рабочий
        день, переменная vacation = true  если у него отпуск. Написать логическое выражение, которое будет true если
        Джон спит.
        */

        // &&, ||, !, ^
        boolean weekDay = true;
        boolean vacation = false;
        boolean result1 = vacation || !weekDay;

            System.out.println(result1);


       /*
       weekday  vacation  result
        false     false    true
        true      false    false
        false     true     true
        */
    }


}
