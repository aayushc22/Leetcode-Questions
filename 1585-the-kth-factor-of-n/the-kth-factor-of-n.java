class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> l = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                l.add(i);
            }
        }
         if (k <= l.size()) {
            return l.get(k - 1);
        } else {
            return -1; 
        }
    }
}