package Homework;


import java.util.Scanner;

/* ЗАДАЧА 2
Написать метод, который принимает в качестве параметра символ и проверяет является ли он гласной
или согласной буквой латинского алфавита.

В зависимости от введенного символа ch метод возвращает следующую строку:
ch is a vowel ( это гласная)
ch is a consonant ( это согласная)
the symbol is not a letter ( символ не является буквой)

Буквы могут быть как заглавными, так и прописными.
При использовании сканера, для получения отдельного символа используйте конструкцию scanner.next().charAt(0)
В решении используйте switch и оператор if-else
В методе main выведите полученный результат на печать
 */
public class Main_HW9_2 {
    public static void main(String[] args) {
        Scanner myScann = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = myScann.next().charAt(0);
        myScann.close();
        System.out.println( defineSymbol(ch));

    }

    public static String defineSymbol(char ch){
        boolean isVowel = false;

        switch (ch){

            case 'o': // можно перечислить в одной строке через запятую
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'O':
            case 'A':
            case 'E':
            case 'I':
            case 'U':   isVowel = true;

        }
        String result;

        if (isVowel){
            result = ch + " is a vowel";
        }
        else {
            if ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A' )) {
                result = ch + " is a consonant";
            }

            else {
                result = ch + " is not s letter";
            }
        }
        return result;

    }

}
