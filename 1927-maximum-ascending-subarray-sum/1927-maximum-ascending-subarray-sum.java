class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0], curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                curr += nums[i];
            } else {
                max = Math.max(max, curr);
                curr = nums[i]; // Reset `curr` to the new start of a potential ascending sequence
            }
        }
        return Math.max(max, curr); // Ensure the last sequence is considered
    }
}
