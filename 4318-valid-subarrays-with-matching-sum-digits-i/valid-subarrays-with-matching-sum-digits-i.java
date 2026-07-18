class Solution {
    public int countValidSubarrays(int[] nums, int x) {


        int ans =0;

     

        for(int i=0;i<nums.length;i++){
            long sum =0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                // if(j!=0)
                if(isValid(sum,x)) ans++;

                // if(j==0){
                // if(isValid(nums[j],x)) ans++;   
                // }
               

            }
        }
  return ans;

        
    }

    private boolean isValid(long num, int x) {
    int lastDigit = (int) (num % 10);
    
    if (lastDigit != x) {
        return false;
    }
    
    long temp = num;
    while (temp >= 10) {
        temp = temp / 10;
    }
    int firstDigit = (int) temp;
    
    return firstDigit == x;
}
}