package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula " +
                "scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. " +
                "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, " +
                "volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (int i=0; i < text.length(); i++ ) {
            char aChar = text.charAt(i);
            if (countMap.containsKey(aChar)) {
                countMap.put(aChar, countMap.get(aChar) + 1);
            } else {
                countMap.put(aChar,1);
            }
        }
        for (Map.Entry<Character, Integer> e: countMap.entrySet())
            System.out.println("The number of " + e.getKey() + " is " + e.getValue() + ".");
    }
}

