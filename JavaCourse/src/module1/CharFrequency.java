package module1;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (freqMap.containsKey(c)) {
                freqMap.put(c, freqMap.get(c) + 1);
            } else {
                freqMap.put(c, 1);
            }
        }

        // Print the frequencies
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}

