/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;

        while (first < last) {
            int mid = first + (last - first) / 2;

            if (isBadVersion(mid)) {
                last = mid; // The first bad version could be mid or before.
            } else {
                first = mid + 1; // The first bad version must be after mid.
            }
        }

        return first; // At the end, first will be the first bad version.
    }
}