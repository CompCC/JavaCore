//Задача: Создать массив целых чисел и заполнить его информацией из
//файла, записанного в предыдущем задании.
//Прочитать данные из файла с числами, предполагая, что разделитель – это число 0.

package Sem5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {


        File fileName = new File("taskOne1");


        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName))) {
            byte[] byteArr = inputStream.readAllBytes();

            int[] arr = IntStream.range(0, byteArr.length).map(i -> byteArr[i] & 0xFF).filter(i -> i != 0).toArray();

            System.out.println(Arrays.toString(arr));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
