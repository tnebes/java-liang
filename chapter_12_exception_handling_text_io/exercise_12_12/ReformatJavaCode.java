/*
 * Write a program that converts java source code from the
 * next-line brace style to
 * the end-of-line brace style.
 *
 * Your program can be invoked from the command line with the java
 * source-file as the argument.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author tnebes
 * 1 March 2021
 */
public class ReformatJavaCode {

    ReformatJavaCode(String[] args) {
        File javaSourceFile = new File(args[0]);
        StringBuilder sb = new StringBuilder();
        String[] buffer = new String[2];
        // check how many lines the file has.
        try {
            Scanner reader = new Scanner(javaSourceFile);
            while (reader.hasNextLine()) {
                buffer[0] = reader.nextLine();
                if (!reader.hasNextLine()) {
                    sb.append(buffer[0]);
                    break;
                }
                buffer[1] = reader.nextLine();
                if (buffer[1].contains("{")) {
                    sb.append(buffer[0]).append(" {").append("\n");
                }  else if (buffer[0].contains("{")) {
                    sb.insert(sb.length() - 1," {").append(buffer[1]).append("\n");
                } else {
                    sb.append(buffer[0]).append("\n").append(buffer[1]).append("\n");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.print("Output:\n");
        System.out.print(sb.toString());
        try {
            writeToNewFile(args[0], sb.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

    private void writeToNewFile(String arg, String content) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(arg);
        writer.print(content);
        writer.close();
    }

    public static void main(String[] args) {
        new ReformatJavaCode(args);
    }
}
