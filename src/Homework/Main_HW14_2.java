package Homework;

public class Main_HW14_2 {

    /*Есть массив целых чисел. Написать метод, находящий и возвращающий количество четных чисел в этом массиве.
     Пример: {1, 2, 8, 7} -> количество четных чисел = 2.
     */

    public static void main(String[] args) {
        int [] numbers = {1, 2, 8, 7};

        System.out.println("countEven result: " + countEven(numbers));

        System.out.println("countEven result: " + countEven(numbers));
        System.out.println("count sum and even: ");

        int[] result = countEvenAndSum(numbers);

        System.out.println("the number of event in array " + result[0]);
        System.out.println("the sum of event in array " + result[1]);



    }

    public static int countEven(int[] numbers) {
        int counter = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0)
                counter++;
        }
        return counter;
    }

    // вывести кол-во четных элементов и их сумму.
    public static int[] countEvenAndSum( int[] numbers){
        int counter = 0;
        int sum = 0;
        int[] res = new int[2];


        for( int i = 0; i < numbers.length; i++)
        {
            if( numbers[i] % 2 == 0) {
                counter++;
                sum = sum + numbers[i];
            }
        }
        res[0] = counter;
        res[1] = sum;

        return res;
    }
}
