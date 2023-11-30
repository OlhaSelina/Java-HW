package Lesson;

public class Lesson_4_Char_class {

    public static void main(String[] args) {
         /* char -тип данных
    система кодировки символов - ASCII
     */

        char ch;
        ch = 'X';
        System.out.println("This is character " + ch);

        ch++;  // инкрементом добавили +1 и получили следующее значение из таблицы после Х - это Y
        System.out.println("This is now " + ch);

        ch = 66; // из таблицы  ASCII это буква В
        System.out.println("66 in ASCII is " + ch );


        ch = '\''; // так мы можем печатать кавычки и слешы \" , \\,
        System.out.println(ch);

         /*
         \n - символ печати с новой строки
         \t - табуляция ( отступ на tab )
          */
        System.out.print("Hellj\nJava\n");
        System.out.println("Hey\tNein\tPreis\t");
    }
}
