class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, count = 0;
        int prev = 0, curr = 0;

        while (count <= (m + n) / 2) {
            prev = curr; 

            if (i == m) {
                curr = nums2[j];
                j++;
            } else if (j == n) {
                curr = nums1[i];
                i++;
            } else if (nums1[i] <= nums2[j]) {
                curr = nums1[i];
                i++;
            } else {
                curr = nums2[j];
                j++;
            }

            count++;
        }
        if((m+n)%2!=0) return (double)curr;
        double median = (curr+prev)/2.0;
        return median;
        
    }
}