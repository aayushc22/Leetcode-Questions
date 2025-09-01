class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;  
        if (n < 1) return 0;
        
        double maxDiagonal = 0;
        int maxArea = 0;
        
        for (int i = 0; i < n; i++) {
            int length = dimensions[i][0];
            int width = dimensions[i][1];
            
            double diagonal = Math.sqrt(length * length + width * width);
            int area = length * width;
            
            if (diagonal > maxDiagonal || (diagonal == maxDiagonal && area > maxArea)) {
                maxDiagonal = diagonal;
                maxArea = area;
            }
        }
        
        return maxArea;
    }
}