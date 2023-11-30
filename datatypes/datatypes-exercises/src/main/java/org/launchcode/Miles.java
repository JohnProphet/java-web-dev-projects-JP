package org.launchcode;
import java.util.Scanner;

public class Miles
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Total miles driven?");
        double numMiles = input.nextDouble();

        System.out.println("How mamy gallons of gas did you use?");
        double numGallons = input.nextDouble();

        double mpg = numMiles / numGallons;
        System.out.println("Current fuel efficiency is " + mpg + " mpg.");
    }
}
