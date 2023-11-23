import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // if and else  - если выполнется первое условие, то дальше проверка не пойдет и это экономит ресурсы
        Scanner Scan = new Scanner(System.in);
        System.out.println(" Enter number");
        int num2 = Scan.nextInt();

        if (num2 < 0){
            System.out.println("Number is negative");
        }
        else if (num2 > 0){
            System.out.println("Number is positive");
        }
        else {
            System.out.println("Number is zero");
        }

        /* 2 вариант

        if - только он  и тут будут проверены все три случая и это перегружает программу.

        if (num2 < 0){
            System.out.println("Number is negative");
        }
        if (num2 > 0){
            System.out.println("Number is positive");
        }
        if (num2 = 0) {
            System.out.println("Number is zero");
        }

         */
        Scan.close();

    }
}

