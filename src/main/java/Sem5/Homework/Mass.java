// Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3],
// и представляют собой, например, состояния ячеек поля для игры в крестики нолики,
// где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
// Такое предположение позволит хранить в одном числе типа int всё поле 3х3. Записать в файл 9 значений так, чтобы они заняли три байта.

package Sem5.Homework;

import java.io.FileOutputStream;
import java.io.IOException;

public class Mass {
    public static void writeToFile(int[] arr) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.dat");
        for (int i : arr) {
            fos.write(i);
            if (i == 3) {
                fos.write("\n".getBytes());
            }
        }
        fos.close();
    }

    public static void main(String[] args) throws IOException {

        int[] arr = new int[9];
// Fill array with random numbers in range [0, 3]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 3);
        }
        writeToFile(arr);
    }
}
