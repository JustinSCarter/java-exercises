package exercises;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the circle's radius?");
        double radius = in.nextDouble();

        boolean positive = false;
        while (!positive)
            if (radius >= 0){
                double area = 3.14 * radius *radius;
                System.out.println("The area of your circle is " + area);
                positive = true;
            }
            else{
                System.out.println("Please provide a non-negative radius:");
                radius = in.nextDouble();
        }
    }
}
