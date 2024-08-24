package leetcode_75;

public class MergeStringsAlternately_1768 {

    public static void main(String[] args) {

        var w1 = "ab";
        var w2 = "pqrs";

        System.out.println(mergeAlternately(w1, w2));
    }

    private static String mergeAlternately(String w1, String w2) {
        var r = new StringBuilder();
        for (int i = 0; i < Math.max(w1.length(), w2.length()); i++) {
            if (i < w1.length()) r.append(w1.charAt(i));
            if (i < w2.length()) r.append(w2.charAt(i));
        }
        return r.toString();
    }
}
