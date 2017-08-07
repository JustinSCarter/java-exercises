package exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintIntList {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(1,1,2,3,5,8));
        for (Integer num : intList) {
            System.out.println(num);
        }
    }
}
