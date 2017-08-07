package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstsentence = "Alice was beginning to get very tired of sitting by her sister on the bank," +
                " and of having nothing to do: once or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice" +
                " 'without pictures or conversation?'";
        System.out.println("What term are you looking for?");
        String searchterm = in.next();

        Boolean found;
        found = firstsentence.contains(searchterm);
        if (found) {
            System.out.println(searchterm + " is in the text!");
        } else {
            System.out.println(searchterm + " isn't in the text. :(");
        }
    }
}