package leetcode_75;

public class ReverseVowelsOfAString_345 {

    public static void main(String[] args) {

        var s1 = "hello";
        var s2 = "leetcode";

        System.out.println(reverseVowels(s1));
        System.out.println(reverseVowels(s2));
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private static void swap(char[] chars, int a, int b) {
        char temp = chars[a];
        chars[a] = chars[b];
        chars[b] = temp;
    }

    private static String reverseVowels(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] chars = s.toCharArray();
        while (l < r) {
            while (l < s.length() && !isVowel(chars[l])) l++;
            while (r >= 0 && !isVowel(chars[r])) r--;
            if (l < r) swap(chars, l++, r--);
        }
        return String.valueOf(chars);
    }
}
