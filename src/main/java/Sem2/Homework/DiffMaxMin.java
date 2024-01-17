//Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.

package Sem2.Homework;

public class DiffMaxMin {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(differenceMaxMin(arr));
    }

    public static int differenceMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        return max - min;
    }
}
