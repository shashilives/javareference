package problem.solving;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(checkForAnagram("anagram", "nagaram"));
    }

    public static boolean checkForAnagram(String str1, String str2) {
        Map<String, Integer> tracker1 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            if (tracker1.containsKey(Character.toString(c))) {
                int tempCounter = tracker1.get((Character.toString(c)));
                tempCounter++;
                tracker1.put(Character.toString(c), tempCounter);
            } else {
                tracker1.put(Character.toString(c), 1);
            }
        }

        Map<String, Integer> tracker2 = new HashMap<>();

        for (char c : str2.toCharArray()) {
            if (tracker2.containsKey(Character.toString(c))) {
                int tempCounter = tracker2.get(Character.toString(c));
                tempCounter++;
                tracker2.put(Character.toString(c), tempCounter);
            } else {
                tracker2.put(Character.toString(c), 1);
            }
        }

        System.out.println(tracker1);
        System.out.println(tracker2);

        for (String c : tracker1.keySet()) {
            if (tracker2.containsKey(c)) {
                if (tracker2.get(c) != tracker1.get(c)) {
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

}
