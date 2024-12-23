class Solution {
    public int maxChunksToSorted(int[] arr) {
        
      Stack<Integer> s = new Stack<>();


        s.push(arr[0]);

        for(int i=1;i<arr.length;i++){
            if(!s.isEmpty() && s.peek()>arr[i]){
                int max=s.pop();
                while(!s.isEmpty()&&s.peek()>arr[i]){
                    s.pop();
                }
                s.push(max);

            }
            else {
                s.push(arr[i]);
            }
        }
      return s.size();
    }
}