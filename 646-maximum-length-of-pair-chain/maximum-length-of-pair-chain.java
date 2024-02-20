class meeting {
    int start, end, pos;
    meeting(int s, int e, int p) {
        start = s;
        end = e;
        pos = p;
    }
}
class meetingComparator implements Comparator<meeting> {
    @Override
    public int compare(meeting o1, meeting o2) {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1; 
    }
}

class Solution {
    public int findLongestChain(int[][] pairs) {
         ArrayList<meeting> meet = new ArrayList<>();
        for(int i = 0; i <pairs.length; i++)
            meet.add(new meeting(pairs[i][0], pairs[i][1], i+1));
             meetingComparator mc = new meetingComparator(); 
        Collections.sort(meet, mc); 
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end; 

        for(int i = 1; i < pairs.length; i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end; 
                answer.add(meet.get(i).pos);
            }
        }
        return answer.size();
    }
}