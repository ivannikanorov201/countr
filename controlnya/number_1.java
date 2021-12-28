/*Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
от 10 до 20(включительно), если да - вернуть true, в противном случае - false*/
public class number_1 {
    public static void main(String[] args){
        System.out.println(method(11, 20));
    }
    public static boolean method(int a, int b) {
        int sum = a + b;
        if ((10 <= sum) && (sum <= 20)) {
            return true;
        }
        return false;
    }

}
