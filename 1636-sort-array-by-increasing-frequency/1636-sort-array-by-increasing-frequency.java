class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        int size = max - min + 1;
        int[] freq = new int[size];
        for (int i = 0; i < n; i++) {
            freq[nums[i] - min]++;
        }
        int maxFreq = 0;
        for (int i = 0; i < size; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        for (int i = 1; i <= maxFreq ; i++) {
            for (int j = size - 1; j >= 0; j--) {
                if (freq[j] == i) {
                    for (int k = 0; k < freq[j]; k++) {
                        list.add(j + min);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = list.get(i);
        }

        return nums;
    }
}