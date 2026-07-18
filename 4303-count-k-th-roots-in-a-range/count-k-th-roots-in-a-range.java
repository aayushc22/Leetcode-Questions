class Solution {
    public int countKthRoots(int l, int r, int k) {


        if (k == 1) {
            return r - l + 1;
        }
        int s = 0, e = (int) Math.min(r, 1000000000); 
        int xMax = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (power(mid, k, r) <= r) {
                xMax = mid;
                s = mid + 1;            
            } else {
                e = mid - 1;
            }
        }

        s=0;
        e=xMax;
        int xMin=xMax+1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (power(mid, k, r) >= l) {
                xMin = mid;
                e = mid - 1; 
            } else {
                s = mid + 1;
            }
        }
        if (xMin > xMax) {
            return 0;
        }
        
        return xMax - xMin + 1;

    }
     private long power(long base, int exp, int limit) {
        long res = 1;
        for (int i = 0; i < exp; i++) {
            res *= base;
            if (res > limit) {
                return limit + 1L;
            }
        }
        return res;
    }
}