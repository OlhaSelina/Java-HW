package Homework;


import java.util.Scanner;

public class Main_HW10_2 {
    /* Изменить код нашей игры "Угадай число" (см. урок 6, класс GuessNumber)
     добавив цикл while таким образом, что игрок получает определенное количество попыток
     для отгадывания числа. Игра должна заканчиваться в двух случаях - либо отгадано секретное
     число либо закончилось количество попыток
     */
    public static void main(String[] args) {
    guessNumber();
    }

    static void guessNumber(){

        Scanner scanner = new Scanner(System.in);
        int secretNumber = 7;
        int attempts = 3;

        while (attempts > 0){
            System.out.println("Guess a number between 0 and 9");
            int answer = scanner.nextInt();
            attempts--; //уменьшаем кол-во попиток

            if (answer == secretNumber) {
                System.out.println("You are right! You have guessed the secret number");
                return;
            }
                else {
                //System.out.println("You are don't right!");
               System.out.print("Sorry, the number  ");

                //  вложенный if
                if (answer < secretNumber)
                    System.out.println("is too small");
                else System.out.println("is too big");

                System.out.println("You have " + attempts + " attempts left");
            }
            //scanner.close();
        }
        System.out.println(" Sorry, buddy. Mayby next time!");

    }
}
