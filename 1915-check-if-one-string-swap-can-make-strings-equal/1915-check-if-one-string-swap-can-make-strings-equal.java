class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true; // If already equal, return true

        int first = -1, second = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (first == -1) {
                    first = i;
                } else if (second == -1) {
                    second = i;
                } else {
                    return false; // More than 2 mismatches, return false
                }
            }
        }
        
        // Check if swapping the mismatched characters makes s1 equal to s2
        return second != -1 && 
               s1.charAt(first) == s2.charAt(second) &&
               s1.charAt(second) == s2.charAt(first);
    }
}
