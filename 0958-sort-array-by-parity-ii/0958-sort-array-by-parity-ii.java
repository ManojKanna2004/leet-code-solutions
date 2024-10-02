class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // If the index is even and the number is odd, find the next even number
            if (i % 2 == 0 && nums[i] % 2 != 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    // Look for an even number to swap with
                    if (nums[j] % 2 == 0) {
                        // Swap the odd number at index i with the even number at index j
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break; // Break after swapping
                    }
                }
            }
            // If the index is odd and the number is even, find the next odd number
            else if (i % 2 != 0 && nums[i] % 2 == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    // Look for an odd number to swap with
                    if (nums[j] % 2 != 0) {
                        // Swap the even number at index i with the odd number at index j
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break; // Break after swapping
                    }
                }
            }
        }
        return nums; // Return the sorted array
    }
}
