class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;
         int[][] ans = new int[rowSum.length][colSum.length];
        for(int i=0;i<rowSum.length;i++){
            for(int j=0;j<colSum.length;j++){
                 if(rowSum[i] == 0) break;
                if(colSum[j] == 0) continue;
                ans[i][j] = Math.min(rowSum[i], colSum[j]);
                rowSum[i] -= ans[i][j];
                colSum[j] -= ans[i][j];
            }
        }

        return ans;
    }
}