//Написать программу заменяющую указанный символ в текстовом
//файле на пробел, сохраняющую получившийся текст в новый файл.


package Sem5.Task3;

import java.io.*;


public class ReplaceSymbolInFile {

    private String filename;

    public ReplaceSymbolInFile(String filename) {
        this.filename = filename;
    }

    public void replaceChar(char targetCaracter, char replaceCharacter) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename + "_replaced"))) {
            while (reader.ready()) {
                char currentChar = (char) reader.read();
                if (currentChar == targetCaracter) {
                    writer.write(replaceCharacter);
                } else {
                    writer.write(currentChar);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void replasePhrase(String actualWord, String target) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename + "_replaced"))) {
            while (reader.ready()) {
                String currentString = reader.readLine();
                if (currentString.contains(target)) {
                    writer.write(currentString.replace(target, actualWord));
                } else {
                    writer.write(currentString);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}


