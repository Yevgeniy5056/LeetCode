package regular;

import java.util.HashMap;

public class FindTheDifference_389 {

    public static void main(String[] args) {

        var s = "abcd";
        var t = "abcde";

        System.out.println(findTheDifference(s, t));
        System.out.println(findTheDifferenceBitManipulation(s, t));
    }

    private static char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        char res = '\0';

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            int countChars = map.getOrDefault(t.charAt(i), 0);
            if (countChars != 0) {
                map.put(t.charAt(i), countChars - 1);
            } else {
                res = t.charAt(i);
            }
        }
        return res;
    }

    private static char findTheDifferenceBitManipulation(String s, String t) {

        char ch = 0;
        for (int i = 0; i < s.length(); i++) {
            ch ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            ch ^= t.charAt(i);
        }
        return ch;
    }
}
