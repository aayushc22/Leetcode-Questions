class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int ma=arr[1]-arr[0];

        for(int i=2;i<arr.length;i++){
            ma=Math.min(ma,arr[i]-arr[i-1]);
        }
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==ma){
                List<Integer> ata= new ArrayList<>();
                ata.add(arr[i-1]);
                ata.add(arr[i]);
                ans.add(ata);
            }
        }
        return ans;
    }
}