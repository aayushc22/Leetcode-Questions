class Solution {
    public int findTheWinner(int n, int k) 
    {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(i);
        }
        return helper(n,k-1,0,list);
    }
    int helper(int n,int k,int ci,ArrayList<Integer> list)
    {
        if(list.size()==1)
        {
            return list.get(0);
        }
        int remIn=(ci+k)%list.size();
        list.remove(remIn);
        return helper(n,k,remIn,list);
    }
}