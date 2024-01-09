public class Q1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp=new int[text1.length()+1][text2.length()+1];
        int ans=0;
        for (int i = 0; i <=text1.length(); i++) {
            dp[0][i]=0;
        }
        for (int i = 0; i <= text2.length(); i++) {
            dp[i][0]=0;
        }
        return ans;
    }
}
