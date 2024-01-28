package Sem5.Task3;

public class Main {
    public static void main(String[] args) {
        ReplaceSymbolInFile replaceSymbolInFile = new ReplaceSymbolInFile("taskOne");
        replaceSymbolInFile.replaceChar(' ', '!');
        replaceSymbolInFile.replasePhrase("5, 6,", "222");

        long timeStart = System.currentTimeMillis();

        System.out.println("replace time: "+ ((System.currentTimeMillis() - timeStart) / 1000));

    }
}
