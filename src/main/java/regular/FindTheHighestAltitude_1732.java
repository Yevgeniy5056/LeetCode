package regular;

public class FindTheHighestAltitude_1732 {

    public static void main(String[] args) {

        var nums = new int[]{-5, 1, 5, 0, -7};

        System.out.println(largestAltitude(nums));
    }

    private static int largestAltitude(int[] gain) {

        var nums = new int[gain.length + 1];
        nums[0] = 0;
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + gain[i - 1];
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
