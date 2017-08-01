package exercises;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is you name?");
        String name = in.next();

        System.out.println("Hello " + name);
    }
}
