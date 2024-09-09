package leetcode_75;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays_2215 {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 2, 3};
        int[] nums2 = new int[]{2, 4, 6};

        System.out.println(findDifference(nums1, nums2));
    }

    private static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return List.of(getElementsOnlyInFirstList(nums1, nums2), getElementsOnlyInFirstList(nums2, nums1));
    }

    private static List<Integer> getElementsOnlyInFirstList(int[] nums1, int[] nums2) {
        var set1 = new HashSet<Integer>();
        var set2 = new HashSet<Integer>();

        for (int i : nums2) set2.add(i);
        for (int i : nums1) if (!set2.contains(i)) set1.add(i);
        return new ArrayList<>(set1);
    }
}
