package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRoster {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newName;

        System.out.println("Enter your student (or ENTER to finish):");

        do {

            System.out.print("Student Name: ");
            newName = in.nextLine();

            if (!newName.equals("")) {
                System.out.print("Student ID#: ");
                Integer newID = in.nextInt();
                students.put(newID, newName);

                in.nextLine();
            }

        } while(!newName.equals(""));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("#" + student.getKey() + " - " + student.getValue() + ".");
        }
    }
}