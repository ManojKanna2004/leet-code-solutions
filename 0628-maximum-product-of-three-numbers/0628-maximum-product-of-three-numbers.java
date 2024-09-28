import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);  // Sort the array

        // Calculate the product of the three largest numbers
        int product1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

        // Calculate the product of the two smallest numbers and the largest number
        int product2 = nums[0] * nums[1] * nums[nums.length - 1];

        // Return the maximum of these two products
        return Math.max(product1, product2);
    }
}
