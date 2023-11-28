package Homework;


/*
    Задача 3
    Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
    public static int findMin(int[] ints)
 */
public class Main_HW13_3 {

    public static void main(String[] args) {
       int[] min = {2, 34,57,34,77,22,11};

        System.out.println("Minimal element:  " + findMin(min));

   }

    public static int findMin(int[] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        return min;
    }

}
