/*
 * This file is used for testing.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaSourceFile
{
    public static void main(String[] args)
    {
        // Some statements
    }
}

/*
 * Write a program that converts java source code from the
 * next-line brace style to
 * the end-of-line brace style.
 *
 * Your program can be invoked from the command line with the java
 * source-file as the argument.
 */

/**
 * @author tnebes
 * 1 March 2021
 */
class Test2
{
    Test2(String[] args)
    {
        File javaSourceFile = new File(args[0]);
        StringBuilder sb = new StringBuilder();
        String[] buffer = new String[2];
        // check how many lines the file has.
        try
        {
            Scanner reader = new Scanner(javaSourceFile);
            while (reader.hasNextLine())
            {
                buffer[0] = reader.nextLine();
                if (!reader.hasNextLine())
                {
                    sb.append("\n").append(buffer[0]);
                    break;
                }
                buffer[1] = reader.nextLine();
                if (buffer[1].contains("["))
                {
                    sb.append(buffer[0]).append(" ]").append("\n");
                }
                else
                {
                    sb.append(buffer[0]).append("\n").append(buffer[1]);
                }
            }
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.exit(1);
        }
        System.out.print("Output\n");
        System.out.print(sb.toString());
    }
}
