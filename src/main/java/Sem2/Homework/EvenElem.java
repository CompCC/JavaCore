//Написать метод, возвращающий количество чётных элементов массива.

package Sem2.Homework;

public class EvenElem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(countEvens(arr));
    }

    public static int countEvens(int[] arr) {
        int conunt = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                conunt += 1;
            }
        }
        return conunt;
    }
}
