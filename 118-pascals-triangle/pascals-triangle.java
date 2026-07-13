class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i=0;i<numRows;i++){
            List<Integer> c = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                c.add(1);
            }else{
            c.add(pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j));
            }
            }
            pascal.add(c);
        }
        return pascal;
    }
}