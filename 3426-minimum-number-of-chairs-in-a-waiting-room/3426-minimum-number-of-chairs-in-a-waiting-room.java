class Solution {
    public int minimumChairs(String s) {
       int count = 0, ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='E') {
                count++;

            } else {
                count--;
            }
            ans = Math.max(count, ans);
        }

        return ans;
    }
}