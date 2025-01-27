package launchcode.org;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.Paths;

public class CharacterCountSuperBonus {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String quoteFromFile = "";

        try {
            System.out.println(Paths.get("").toAbsolutePath().getParent());

            File textFromFile = new File("src/main/resources/quote.txt");
            Scanner myReader = new Scanner(textFromFile);
            if (myReader.hasNextLine()) {
                quoteFromFile = myReader.nextLine();
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred when trying to read quote from file");

            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            char[] charArray = quoteFromFile.toUpperCase().toCharArray();

            HashMap<Character, Integer> counts = new HashMap<>();

            for (char letter : charArray) {

                if (alphabet.indexOf(letter) >= 0) {

                    if (counts.containsKey(letter)) {
                        counts.put(letter, counts.get(letter) + 1);
                    } else {
                        counts.put(letter, 1);
                    }
                }

                for (Map.Entry<Character, Integer> count : counts.entrySet()) {
                    System.out.println(count.getKey() + ": " + count.getValue());
                }
            }

        }
    }
}