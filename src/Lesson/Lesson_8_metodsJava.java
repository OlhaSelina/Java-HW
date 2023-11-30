package Lesson;

public class Lesson_8_metodsJava {
    public static void main(String[] args) {
        String res = sayHello("Alex");
        System.out.println(res);
        hello();
        walk("Olha ", 42); // это делаем вызов наших созданных методов
        walk("Gregor", 50);

        int x = 5;
        int y = 6;
        int result = sum(1, 2);
        System.out.println("Result of sum metod is " + result);
        System.out.println("Result2 of sum metod is " + sum(x, y ));
         // в аргументах можно передать разного типа данные
        /* если надо несколько раз повторить віполнение нашего метода, то можем либо использовать цикл
        либо просто еще раз добавить в main название нашего метода
         */
    }


            /*
             Методы Java
             есть два вида методов - 1) те что уже есть в библиотеках джавы,
             2) можно метод написать самому со своими названиями
             Метод нельзя писать внутри другого метода. только как новый , но внутри одного класса

             Метод начинается с маленькой буквы , не могут начинаться с цифры ,нельзя пробел
             можно использовать camelCase
             */

   static void hello(){
        System.out.println("Hello");
        System.out.println("Olha");
        System.out.println("Java");
    }

   static void walk(String name, int age){
        System.out.println(name + " can walk ." + "Hi/she it " + age);
    }

   static int sum(int a, int b){ // не забывать тут менять void на тот тип данных какие мы возвращаем

       int plus = a + b;
       int minus = a - b;

       //System.out.println(plus); // если хотим потом использовать этот результат, то надо прописать команду return
       //System.out.println(minus);

       return plus;


   }

    static String sayHello (String name){
       return "Hello, " + name + "!";
    }
}

