package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your student's name(s) (or press ENTER to finish):");

        // Get student names and IDs
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.isEmpty())
            {
                System.out.print("ID: ");
                Integer newID = input.nextInt();
                classRoster.put(newID, newStudent);

                input.nextLine();
            }
        } while(!newStudent.isEmpty());

        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet())
        {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}
