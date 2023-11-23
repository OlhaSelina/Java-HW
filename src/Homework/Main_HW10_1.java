package Homework;

public class Main_HW10_1 {

    /*
    С помощью цикла while написать метод, выводящий на экран куб числа от 1 до заданного числа n.
static void printCube( int n )
Пример:для числа n=3
1 в кубе 1
2 в кубе 8
3 в кубе 27
     */

    public static void main(String[] args) {

        int n = 3;
        printCube(n);

    }

   public static void printCube(int n ){ // если void, то не будет возвращать и не надо писать retutn

        int i = 1;
        int kub = 0;
        while (i <= n){

            kub = i*i*i;
            System.out.println( i + " в кубе " + kub);
            i++;

            /*
            2 вариант
            public static void printCube(int n ){
             int i = 1;
                 while (i <= n){
                    System.out.println( i + " в кубе " + (i*i*i));
                    i++;
                }
            }
             */
        }

   }
}
