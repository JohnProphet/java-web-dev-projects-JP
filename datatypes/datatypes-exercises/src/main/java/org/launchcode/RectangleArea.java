package org.launchcode;
import java.util.Scanner;
public class RectangleArea
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle Length:");
        double length = input.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Rectangle Width:");
        double width = input2.nextDouble();

        double area = width*length;
        System.out.println("Area of Rectangle:" + area);
    }
}
