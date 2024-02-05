//Написать функцию, добавляющую префикс к каждому из набора файлов, названия которых переданы ей в качестве параметров через пробел.

package Sem5.Homework;

public class Pref {
    public static void main(String[] args) {
        String prefix = "pre-";
        for (String file : args) {
            System.out.println(prefix + file);
        }
    }
}
