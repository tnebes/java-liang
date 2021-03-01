/*
 * Write a program that removes all the occurrences of a specified string
 * from a text file.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author tnebes
 * 1 March 2021
 */
public class RemoveText {

    RemoveText(String[] args) {
        StringBuilder sb = new StringBuilder();
        File theFile = new File(args[1]);
        Scanner reader;
        try {
            String token;
            reader = new Scanner(theFile);
            while (reader.hasNextLine()) {
                token = reader.nextLine();
                if (token.contains(args[0])) {
                    token = token.replaceAll(args[0], "");
                }
                sb.append(token).append("\n");
            }
            reader.close();
            PrintWriter writer = new PrintWriter(theFile);
            writer.print(sb.toString());
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        new RemoveText(args);
    }
}
