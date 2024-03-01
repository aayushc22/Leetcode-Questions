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
                ans.add(List.of(arr[i-1],arr[i]));
            }
        }
        return ans;
    }
}