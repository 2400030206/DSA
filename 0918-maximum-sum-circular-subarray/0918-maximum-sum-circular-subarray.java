class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int curMax = 0;
        int curMin = 0;

        for (int i = 0; i < nums.length; i++) {

            total += nums[i];

            
            curMax = Math.max(nums[i], curMax + nums[i]);
            maxSum = Math.max(maxSum, curMax);

           
            curMin = Math.min(nums[i], curMin + nums[i]);
            minSum = Math.min(minSum, curMin);
        }

        
        if (maxSum < 0) {
            return maxSum;
        }

        
        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}