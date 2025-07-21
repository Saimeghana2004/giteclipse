package module1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestWithCollectionsMax {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 9, 3};  // Must use Integer, not int
        List<Integer> list = Arrays.asList(arr);

        int max = Collections.max(list);
        System.out.println("Largest (Collections.max): " + max);
    }
}

