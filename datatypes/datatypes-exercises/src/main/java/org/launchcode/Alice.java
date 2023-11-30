package org.launchcode;
import java.util.Scanner;
public class Alice
{
    public static void main(String[] args) {
        String Book = "Aice was beginning to get very tired of sitting by her sister on" +
                " the bank, and of having nothing to do: once or twice she had peeped" +
                " into the book her sister was reading, but it had no pictures or " +
                "conversations in it, ‘and what is the use of a book,’ thought Alice " +
                "‘without pictures or conversation?’";
        // prompt user for a term to search
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your desired search term:");
        String term = input.next();
        // print whether or not search term was found
        // make it case insensitive
        boolean found = findTerm(Book, term);

        if (found) {
            System.out.println(term + " found.");
        } else {
            System.out.println(term + " not found.");
        }
    }
}

