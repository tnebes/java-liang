/*
 * Write a method that returns the position number
 * of a line in the file or -1 if there is no such line or file.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author tnebes
 * 1 March 2021
 */
public class ReadingSortedFile {

    ReadingSortedFile(String[] args) {
        File theFile = new File(args[0]);
        int line = -1;
        String searchTerm = getSearchTerm("Enter a name to find its location in the file: ");
        try {
            line = readInFile(searchTerm, theFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.print(line);
    }

    private String getSearchTerm(String message) {
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int readInFile(String line, File file) throws FileNotFoundException {
        int counter = 0;
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            counter++;
            if (reader.nextLine().equalsIgnoreCase(line)) {
                return counter;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new ReadingSortedFile(args);
    }
}
