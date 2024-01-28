// Написать программу, читающую и выводящую в содержимое
//текущей папки .

//Написать программу таким образом, чтобы она рекурсивно выводила содержимое не только текущей папки,
//но и вложенных

package Sem5.Task4;

public class Main {
    public static void main(String[] args) {
        ShowFilesInCurrentDir showFilesInCurrentDir = new ShowFilesInCurrentDir();
        showFilesInCurrentDir.printFiles();
        showFilesInCurrentDir.printAllFilesRecur();
    }
}
