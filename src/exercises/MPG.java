package exercises;

import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        double miles;
        double gallons;
        Scanner in = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        miles = in.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        gallons = in.nextDouble();
        double mpg =  miles/gallons;
        System.out.println("Your MPG is " + mpg);
    }
}
