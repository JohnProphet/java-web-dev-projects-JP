package org.launchcode;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListPractice {
    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;


        System.out.println("Enter the word length: ");
        int numChars = input.nextInt();
    }
    public static void main(String[] args) {

    }
}
