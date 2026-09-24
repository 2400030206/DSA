class Solution {
    public int minOperations(int[] nums, int x) {

        int total = 0;

        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int target = total - x;
        if (target < 0) {
            return -1;
        }
        int sum = 0;
        int j = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum > target) {
                sum -= nums[j];
                j++;
            }
            if (sum == target) {
                min = Math.min(min, nums.length - (i - j + 1));
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}