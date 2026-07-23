class Solution {
    public List<String> letterCombinations(String digits) {
      List<String> ans= new ArrayList<>();
        if(digits.length()==0)
            return ans;
         int number = Integer.parseInt(digits);
        String[] a= keypad(number);
        List al = Arrays.asList(a);
        return al;
    }
    public String[] keypad(int s){
          if(s==0)
        {
            String[] ans = {""};
            return ans;
        }
          String[] helper=helper(s%10);
          String[] smallAns=keypad(s/10);
          int m = smallAns.length*helper.length;
          String[] ans=new String[m];
                int k=0;
            for(int i=0;i<smallAns.length;i++){
            for(int j=0;j<helper.length;j++){
                ans[k]=smallAns[i]+helper[j];
                k++;
            }
        }
   
    return ans;
    }
    private  String[] helper(int n){
        if(n==2)
            return new String[]{"a","b","c"};
        if(n==3)
            return new String[]{"d","e","f"};
        if(n==4)
            return new String[]{"g","h","i"};
        if(n==5)
            return new String[]{"j","k","l"};
        if(n==6)
            return new String[]{"m","n","o"};
        if(n==7)
            return new String[]{"p","q","r","s"};
        if(n==8)
            return new String[]{"t","u","v"};
        if(n==9)
            return new String[]{"w","x","y","z"};
        
        return new String[]{"a","b","c"};
    }
}