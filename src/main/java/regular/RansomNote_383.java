package regular;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {

    public static void main(String[] args) {

        String ransomNote = "aa";
        String magazine = "aab";

        System.out.print(canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {

        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            }
            map.put(c, count - 1);
        }
        return true;
    }
}
