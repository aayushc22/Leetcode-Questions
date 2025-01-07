class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n =shifts.length;
    

        for(int i=n-2;i>=0;i--){
            shifts[i]=(shifts[i]+shifts[i+1])%26;
        }

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            // chat ta = (char)c+ps[i];
            char ta = (char)((c - 'a' + shifts[i]) % 26 + 'a');
            sb.append(ta);
        }

        return sb.toString();

    }
}