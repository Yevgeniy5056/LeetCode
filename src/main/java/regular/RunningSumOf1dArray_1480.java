package regular;

import java.util.Arrays;

public class RunningSumOf1dArray_1480 {

    public static void main(String[] args) {

        var nums = new int[]{1, 2, 3, 4};

        System.out.println(Arrays.toString(runningSum(nums)));
    }

    private static int[] runningSum(int[] nums) {

        var sums = new int[nums.length];
        sums[0] = nums[0];

        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
        return sums;
    }
}
