/*Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21*/
public class number_2 {
    public static void main(String[] args) {
        int[] array = new int[8];
        int j = 0;
        int fill = array.length;
        System.out.println(" ");

        for (int i = 0; i < fill; ++i, j = j + 3) {
            array[i] = j;
            System.out.print(+array[i] + " ");
            System.out.print(" ");
        }
    }
}
