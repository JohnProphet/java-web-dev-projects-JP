package org.launchcode;

import java.util.Scanner;

public class Area
{
    public static void main(String[] args)
    {
        double radius;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextDouble();
//        while (boolean isNumber = radius instanceof Integer) {;

        input.close();
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " +radius + " is: " +area);
    }
}
