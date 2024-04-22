class Solution {
    public List<List<String>> partition(String s) {
       List<List<String>> ans = new ArrayList<>();
       List<String> ds = new ArrayList<>();
       int n=s.length();
       backtrack(0,n,s,ds,ans);
       return ans;
    }
    public void backtrack(int in,int n,String s,List<String> ds,List<List<String>> ans){
        if(in==n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=in;i<n;i++){
            if(isPal(s,in,i)){
                ds.add(s.substring(in,i+1));
                backtrack(i+1,n,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
    boolean isPal(String s,int start,int end){
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}