class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n= board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(helper(board,word,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean helper(char[][] board,String word,int i,int j){
        int m=board.length;
        int n= board[0].length;
        if(word.length()==0)
        return true;
        if(i<0||i>=m||j<0||j>=n||board[i][j]!=word.charAt(0)||board[i][j]=='v'){
            return false;
        }
        char c= board[i][j];
        board[i][j]='v';
        if(helper(board,word.substring(1),i-1,j)||helper(board,word.substring(1),i+1,j)||helper(board,word.substring(1),i,j-1)||helper(board,word.substring(1),i,j+1))
        return true;
        board[i][j]=c;
        return false;
    }
}