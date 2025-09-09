import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        
        // Copy first m elements of nums1
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }
        
        // Copy all n elements of nums2
        for (int i = 0; i < n; i++) {
            arr[m + i] = nums2[i];
        }
        
        // Sort merged array
        Arrays.sort(arr);
        
        // Copy back into nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = arr[i];
        }
    }
}
