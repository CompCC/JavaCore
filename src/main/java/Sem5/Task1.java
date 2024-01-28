//Создать массив из 9 цифр и записать его в файл используя поток вывода.
//Удостовериться, что числа записаны не символами, а цифрами, что сократит объём хранения в 8 и более раз
//(из-за представления цифр в виде ASCII символов). При этом важно помнить о допущениях такого способа записи,
//поскольку числа нужно как-то отделять друг от друга, а любой символ, например, пробел (32), имеет числовое
//представление, и внутри файла будет неотличим от числа 20. А любое отрицательное число будет воспринято потоком
//чтения как конец потока. Для выполнения задания сделать разделителем число 0.

package Sem5;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        int[] intArr = new int[]{1, 2, 3, 45, 5, 6, 7, 2, 3};

        //try (BufferedWriter writer = new BufferedWriter(new FileWriter("taskOne"))) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("taskOne1"))) {
            //writer.write(Arrays.toString(intArr));
            for (Integer number: intArr){
                outputStream.writeByte(number);
                outputStream.writeByte(0);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
