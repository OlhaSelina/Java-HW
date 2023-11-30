package Lesson;

public class Lesson_10_while_loop {

    // While loop - цикл While

    /*
    while ( condition)
    {
        statement(s) // блок кода
     }
     */

    public static void main(String[] args) {
        /* долгий вариант...
        int i = 1;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);

        System.out.println("In while loop");

         */
        // вариант сделать цикл :
        int y = 1; // присвоили изночальное значение

        while (y <= 5){   //- задаем условие что пока у меньше или равен 5 выводить данные

            if(y%2 == 0) {
                System.out.println(y + " is even");   // вывод четных чисел
            }
            else{
                System.out.println(y + " is odd" ); //вывод не четных чисел
            }
            y++; // - будет печатать каждый раз на +1 значение, пока не доберемся до указанного ограничения ( например <=5)

        }
        System.out.println("after while");


        /* бесконечный вывод чисел

        int k = 1;
        while (k >=1){
            System.out.println(k);
        }

         */


        char ch = 'a';
        while (ch <= 'z'){
            System.out.println(ch + " ");
            ch++; // вывод следующих букв, пока не доберется до z - тогда цикл закончится
        }

        /*
        while (true){
            System.out.println(1); //  Печать бесконечного цикла.
        }

         */


        System.out.println("Count sum");

        System.out.println(sumNumbers(5)); // сумму цифр от 1 до 5 ( 1+2+3+4+5=15)
    }

    static  int sumNumbers(int n){

        int sum = 0;
        int i = 1;

        while (i <= n){
            sum = sum + i;
            i++;
        }
        return sum;
    }


    /* do  - тут второй вариант ..
    {
     }  while (condition)
     */
}
