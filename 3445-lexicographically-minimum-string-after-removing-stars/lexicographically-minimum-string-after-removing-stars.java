class Solution {
    public String clearStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        PriorityQueue<int[]> pq = new PriorityQueue<>((int[] a,int[] b)->{int charComparison = Integer.compare(a[0],b[0]);
        if(charComparison != 0){
            return charComparison;
        }
        return Integer.compare(b[1],a[1]);
        });

        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='*'){
                sb.setCharAt(i,'.');
                int left =i-1;

                int smallestleftcharindex=(pq.poll())[1];

                sb.setCharAt(smallestleftcharindex,'.');
                left--;
            }
            else{
                pq.add(new int[]{s.charAt(i),i});
            }
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)!='.'){
                ans.append(sb.charAt(i));
            }
        }
        return ans.toString();
    }
}