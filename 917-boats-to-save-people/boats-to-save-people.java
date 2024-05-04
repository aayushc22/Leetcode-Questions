class Solution {
    public int numRescueBoats(int[] people, int limit) {
       Arrays.sort(people);

       int i=0,n=people.length-1;
       int numBoats=0;
       while(i<=n){
         if(people[i]+people[n]<=limit)
         i++;
         n--;
         numBoats++;
       } 
       return numBoats;
    }
}