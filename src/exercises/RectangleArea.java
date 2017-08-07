package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is the rectangle's length?");
        double length = in.nextDouble();

        System.out.println("What is the rectangle's width?");
        double width = in.nextDouble();

        double area =  length * width;
        System.out.println("The rectangle's area is " + area);
    }
}
