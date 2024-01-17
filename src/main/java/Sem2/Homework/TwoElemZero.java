//Написать функцию, возвращающую истину, если в переданном массиве есть два
//        соседних элемента, с нулевым значением.
package Sem2.Homework;

public class TwoElemZero {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0};
        System.out.println(twoElementsZero(arr));
    }

    public static boolean twoElementsZero(int[] arr) {
        boolean res = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                try {
                    if (arr[i + 1] == 0) {
                        res = true;
                        break;
                    }
                } catch (IndexOutOfBoundsException e) {
                    break;
                }
            }
        }
        return res;
    }
}
