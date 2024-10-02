class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int evenIndex = 0;
        int oddIndex = 1;

        for (int num : A) {
            if (num % 2 == 0) {
                result[evenIndex] = num;
                evenIndex += 2;
            } else {
                result[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return result;
    }
}