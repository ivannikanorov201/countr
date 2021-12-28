/*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
и числа меньшие 6 умножить на 2*/
public class number_3 {
     public static void main(String[] args){
         int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
         int arr3 = array3.length;
         for (int i = 0; i < arr3; i++) {
             if (array3[i] < 6)
                 array3[i] = array3[i] * 2;
         }
         System.out.println(" ");

         for (int i = 0; i < arr3; i++) {
             System.out.print(+array3[i] + ", ");
         }
     }
}
