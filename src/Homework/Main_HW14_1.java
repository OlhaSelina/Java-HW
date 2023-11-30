package Homework;

public class Main_HW14_1 {
   // Доделать задачу про равенство двух массивов целых чисел ( см. код занятия for_each DEmo)
    /*
    // написать метод, проверяющий равенство двух массивов целых чисел. В случае если массивы равны, метод
         возвразает true, если нет то  false. Равны и длинна и значения

     */
   public static void main(String[] args) {
       int[] array1 = {1,2,3,4};
       int[] array2 = {1,2,3,4};
       int[] array3 = {1,2,16,4};

       System.out.println(areEqual(array1,array2));
       System.out.println(areEqual(array1, array3));

   }
    public static boolean areEqual(int[] array1, int[] array2) {

        if (array1.length != array2.length)
            return false;
        for (int i = 1; i < array1.length; i++){
            if (array1[i] != array2[i]){
                return false;
            }
        }
        return true;

    }
}
