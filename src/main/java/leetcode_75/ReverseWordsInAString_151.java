package leetcode_75;

public class ReverseWordsInAString_151 {

    public static void main(String[] args) {

        var s1 = "the sky   is blue";
        var s2 = "the sky is blue";

        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));
    }

    private static String reverseWords(String s) {

        var words = s.split(" ");
        var res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!words[i].isBlank()) res.append(words[i]).append(" ");
        }
        return res.toString().trim();
    }
}
