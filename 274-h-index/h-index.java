class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hi=0;
        int n=citations.length;
        for(int i=0;i<citations.length;i++){
            int cit=citations[n-i-1];
            if(cit>=i+1){
                hi++;
            }
            else
            break;
        }
        return hi;
    }
}