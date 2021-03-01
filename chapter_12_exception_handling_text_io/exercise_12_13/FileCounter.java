/*
 * Write a program that will count the number of characters, words and lines in a file.
 * Words are seperated by whitespace characters.
 * The file name should be passed as a command-line argument
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author tnebes
 * 1 March 2021
 */
public class FileCounter {

    FileCounter(String[] args) {
        File counterFile = new File(args[0]);
        int characterCount = 0, wordCount = 0, lineCount = 0;
        try {
            characterCount = countCharacter(counterFile);
            wordCount = countWord(counterFile);
            lineCount = countLine(counterFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.printf("File %s has\n%d characters\n%d words\n%d lines\n",
                args[0], characterCount, wordCount, lineCount);
    }

    private int countCharacter(File counterFile) throws FileNotFoundException {
        Scanner reader = new Scanner(counterFile);
        String fileContent = reader.useDelimiter("\\Z").next();
        return fileContent.length();
    }

    private int countWord(File counterFile) throws FileNotFoundException{
        Scanner reader = new Scanner(counterFile);
        int counter = 0;
        while (reader.hasNext()) {
            reader.next();
            counter++;
        }
        return counter;
    }

    private int countLine(File counterFile) throws FileNotFoundException {
        Scanner reader = new Scanner(counterFile);
        int counter = 0;
        while (reader.hasNextLine()) {
            reader.nextLine();
            counter++;
        }
        return counter;
    }
    
    public static void main(String[] args) {
        new FileCounter(args);
    }

}
