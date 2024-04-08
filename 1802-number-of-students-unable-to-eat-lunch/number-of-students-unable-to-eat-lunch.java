class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stk = new Stack<>();

        for(int i=sandwiches.length-1;i>=0;i--){
            stk.push(sandwiches[i]);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int student:students){
            q.add(student);
        }
        int ser=0;
        while(!q.isEmpty()&&ser<q.size()){
            if(stk.peek().equals(q.peek())){
                stk.pop();
                q.poll();
                ser=0;
            }
            else{
                q.add(q.peek());
                q.poll();
                ser++;
            }
        }
        return q.size();
    }
}