import java.util.Scanner;

/*
Написать программу, которая при вводе с клавиатуры дня недели отвечает
        на вопрос является ли этот день выходным. (true/false) Использовать Enum !
*/

public class Main {
        public static void main(String[] args) {

            Scanner myScan = new Scanner(System.in);
            System.out.print ("Please enter the name of the day of the week: ");

            String str = myScan.nextLine().toUpperCase();
            Weekend day = Weekend.valueOf(str);
            boolean isWeekend = day.isWeekend();

            if (true) {
                System.out.println("A day  " + day + " is a day off: " + isWeekend);
            }

            myScan.close();
        }
}

