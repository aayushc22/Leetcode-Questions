class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;

        int c1=0,c2=0,e1=Integer.MIN_VALUE,e2=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(c1==0&&e2!=nums[i]){
                e1=nums[i];
                c1=1;
            }
            else if(c2==0&&e1!=nums[i]){
                c2=1;
                e2=nums[i];
            }
            else if(nums[i]==e1){
                c1++;
            }
            else if(nums[i]==e2){
                c2++;
            }
            else{
                c1--;c2--;
            }
        }
        List<Integer> ls=new ArrayList<>();
        c1=0;c2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==e1) c1++;
            if(nums[i]==e2) c2++;
        }
        int m=(int)(n/3)+1;
        if(c1>=m) ls.add(e1);
        if(c2>=m) ls.add(e2);
        return ls;
    }
}