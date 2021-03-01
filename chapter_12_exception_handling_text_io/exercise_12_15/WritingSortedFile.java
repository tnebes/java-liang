/*
 * Write a method that writes a name at its correct position in the file
 * so that is fulfills the assumptions:
 * The names are listed in ascending alphabetical order. The same line cannot be found twice.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author tnebes
 * 1 March 2021
 */
public class WritingSortedFile {

    WritingSortedFile(String[] args) {
        File myFile = new File(args[0]);
        String userInput = getUserInput("Enter a name to write it to a file: ");
        int line = -1;
        try {
            line = writeInFile(userInput, myFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        showFeedback(line, userInput);
    }

    private void showFeedback(int line, String userInput) {
        switch(line) {
            case -1 -> System.out.print("Something went wrong during writing.\n");
            case -2 -> System.out.printf("Couldn't write %s as it already exists in file.\n", userInput);
            default -> System.out.printf("Successfully wrote %s at line %d", userInput, line);
        }
    }

    private String getUserInput(String s) {
        System.out.print(s);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static int writeInFile(String name, File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        // if the file is empty
        if(!file.exists()) {
            file.createNewFile();
            sb.append(name);
            PrintWriter writer = new PrintWriter(file);
            writer.print(sb.toString());
            writer.close();
            return 1;
        }
        if (checkNameExists(name, file)) {
            return -2;
        }
        int line = 0, finalLine = -1;
        Scanner reader = new Scanner(file);
        boolean triggered = false;
        while (reader.hasNextLine()) {
            String lineContent = reader.nextLine();
            line++;
            if (!triggered && name.compareTo(lineContent) < 0) {
                sb.append(name).append("\n");
                finalLine = line++;
                triggered = true;
            }
            sb.append(lineContent).append("\n");
        }
        if (!triggered) {
            sb.append(name).append("\n");
        }
        reader.close();
        System.out.print(sb.toString());
        PrintWriter writer = new PrintWriter(file);
        writer.print(sb.toString());
        writer.close();
        return finalLine;
    }

    private static boolean checkNameExists(String name, File file) throws FileNotFoundException {
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            if (reader.nextLine().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new WritingSortedFile(args);
    }
}
