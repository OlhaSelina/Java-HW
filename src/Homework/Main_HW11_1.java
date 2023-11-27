package Homework;

import java.util.Scanner;

public class Main_HW11_1 {

    /*
Написать метод, выводящий на печать результат умножения данного числа n на
все целые числа от 0 до n
 */

        public static void main(String[] args) {

            System.out.print("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            scanner.close();

            multiplyNumber(number);
        }

        private static void multiplyNumber(int number) {
            int index = 0;

            while(index <= number) {

                System.out.println(number + " * " + index + " = " + (number * index));
                index++;

            }
        }

}
