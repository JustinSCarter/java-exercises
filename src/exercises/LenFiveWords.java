package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LenFiveWords {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList("hello", "nope", "koala", "python", "java"));
        ArrayList<String> fiveLenWords = new ArrayList<>();
        for (String word : wordList) {
            if (word.length() == 5) {
                fiveLenWords.add(word);
            }
        }
        String finalList = String.join(" and ", fiveLenWords);
        System.out.println("The five letter words in your list are: " + finalList + ".");
    }
}
