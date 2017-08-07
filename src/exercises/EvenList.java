package exercises;


import java.util.ArrayList;
import java.util.Arrays;

public class EvenList {
    public static void main(String[] args) {
        ArrayList <Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> EvenInts = new ArrayList<>();
        for (Integer checkInt : intList) {
            if ((checkInt % 2) == 0) {
                EvenInts.add(checkInt);
            }
        }
        System.out.println("The even number in your list are " + EvenInts);
    }
}
