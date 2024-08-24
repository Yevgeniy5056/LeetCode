package leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies_1431 {

    public static void main(String[] args) {

        var candies = new int[]{2, 3, 5, 1, 3};
        var extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    private static List<Boolean> kidsWithCandies(int[] c, int ec) {

        var m = c[0];
        for (var i : c) m = Math.max(m, i);
        var r = new ArrayList<Boolean>();
        for (var i : c) r.add(i >= m - ec);
        return r;
    }
}
