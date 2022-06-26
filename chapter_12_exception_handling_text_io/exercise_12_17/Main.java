import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * @author tnebes 21 April 2021
 */

/*
 *
 * Write the hangman program to use words stored in a text file.
 * Words are delimited by spaces.
 *
 */

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        //
    }

    private String getWordFromFiles() {

        File hangmanFile = new File("*" + File.separator + "hangman.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(hangmanFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
        List<String> hangmanString = new ArrayList<>(giveIndividualWords(scanner));
        

        return null;
    }

    private Collection<String> giveIndividualWords(Scanner scanner) {
        List<String> individualWords = new ArrayList<>();
        while (scanner.hasNext()) {
            individualWords.add(scanner.next());
        }
        return individualWords;
    }
}
