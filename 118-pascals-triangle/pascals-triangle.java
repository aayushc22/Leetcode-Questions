
class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> pre = null;
        for(int i=0;i<n;i++){
            List<Integer> ra = new ArrayList<>();
            for(int j=0;j<=i;j++)
                if(j==0||j==i)
                ra.add(1);
                else
                ra.add(pre.get(j-1)+pre.get(j));
                pre=ra;
                ans.add(ra);
             
        }
        return ans;
    }
}