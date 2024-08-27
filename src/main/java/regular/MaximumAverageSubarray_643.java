package regular;

public class MaximumAverageSubarray_643 {

    public static void main(String[] args) {

        var array = new int[]{1, 12, -5, -6, 50, 3};
        var k = 4;

        System.out.println(findMaxAverage(array, k));
        System.out.println(findMaxAverage2(array, k));
    }

    private static double findMaxAverage(int[] nums, int k) {

        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
        double res = sums[k - 1];
        for (int i = k; i < sums.length; i++) {
            res = Math.max(res, sums[i] - sums[i - k]);
        }
        return res / k;
    }

    private static double findMaxAverage2(int[] nums, int k) {

        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            sum = Math.max(sum, sum - nums[i - k] + nums[i]);
        }
        return sum / k;
    }
}
