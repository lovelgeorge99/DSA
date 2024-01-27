import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Q576   {
    public static int solve(int m, int n, int maxMove, int i, int j,int[][][] dp){
        int mod= 1000000000+7;
        if(maxMove<0){
            return 0;
        }
        if(i<0 || j<0 || i>=m || j>=n){
            return 1;
        }
        if(dp[i][j][maxMove]>0){
            return dp[i][j][maxMove];
        }

        int top=solve(m,n,maxMove-1,i-1,j,dp);
        int bottom=solve(m,n,maxMove-1,i+1,j,dp);
        int right=solve(m,n,maxMove-1,i,j+1,dp);
        int left=solve(m,n,maxMove-1,i,j-1,dp);

        dp[i][j][maxMove]=(top+left+right+bottom)%mod;
        return dp[i][j][maxMove];
    }
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        int[][][] dp=new int[m][n][maxMove+1];

        return solve(m,n,maxMove,startRow,startColumn,dp);

    }
}
