class Solution {
    public int maxDistance(int[] stalls, int k) {

        Arrays.sort(stalls);
        
        int n = stalls.length;
        int low = 1; 
        int high = stalls[n - 1] - stalls[0]; 
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (isPossible(stalls, k, mid)) {
                ans = mid; 
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        
        return ans;
        
    }
    private boolean isPossible(int[] stalls, int k, int mid) {
        int cowsPlaced = 1; 
        int lastPos = stalls[0]; 
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= mid) {
                cowsPlaced++; 
                lastPos = stalls[i]; 
            }
            
            if (cowsPlaced == k) {
                return true;
            }
        }
        
        return false;
    }
}