package leetcode_75;

public class ReverseWordsInAString_151 {

    public static void main(String[] args) {

        var s = "the sky is blue";

        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {

        var words = s.split(" ");
        var res = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]).append(" ");
        }
        return res.toString().trim();
    }
}
