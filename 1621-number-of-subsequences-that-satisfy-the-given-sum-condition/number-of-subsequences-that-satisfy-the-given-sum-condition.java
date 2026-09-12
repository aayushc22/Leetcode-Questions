class Solution {
        static final int MOD = 1_000_000_007;

    public int numSubseq(int[] nums, int target) {

        Arrays.sort(nums);

        int ans =0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]+nums[i]>target) break;
            int r = bs(nums,i,target);
            ans = (ans + power(r - i)) % MOD;

        }

    

        return ans;
        
    }
    int bs(int nums[],int l,int target){
        int rl=l;
        
        int h = nums.length-1;
        int max=l;

        while(l<=h){
            int mid = (l+h)/2;
            if(isValid(nums,rl,mid,target)){
                max=mid;
                l=mid+1;
            }
            else{
                h=mid-1;
            }


        }
        return max;
    }
    boolean isValid(int nums[],int l,int m,int t){
        if(nums[l]+nums[m]<=t) return true;
        return false;
    }
int power(int n) {
    int MOD = 1000000007;
    long res = 1;
    long base = 2;
    
    while (n > 0) {
        if (n % 2 == 1) {
            res = (res * base) % MOD;
        }
        base = (base * base) % MOD;
        n /= 2;
    }
    return (int) res;
}
}