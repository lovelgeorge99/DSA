public class Q931 {

    public static int min(int i,int j,int k){
        return Math.min(Math.min(i, j), k);

    }
    public static int minFallingPathSum(int[][] matrix) {
        int n= matrix.length;
        int m=Integer.MAX_VALUE;
        if(n==1){
            return matrix[0][0];
        }
        int[][] dp=new int[n][n];
        for (int col = 0; col < n; col++) {
            dp[0][col]=matrix[0][col];
        }

        for (int row = 1; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int a=Integer.MAX_VALUE;
                int b=Integer.MAX_VALUE;
                if(col>0){
                    a =dp[row-1][col-1];
                }
                if(col<n-1){
                    b=dp[row-1][col+1];
                }
                dp[row][col]=matrix[row][col]+min(a,dp[row-1][col],b);

            }

        }

        for (int col = 0; col < n; col++) {
            if(dp[n-1][col]<m){
                m=dp[n-1][col];
            }

        }


        return m;
    }

    public static void main(String[] args) {
        int[][] matrix={{2,1,},{6,5}};
        System.out.println(minFallingPathSum(matrix));
    }
}
