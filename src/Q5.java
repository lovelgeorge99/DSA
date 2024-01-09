public class Q5 {
    public int longestPalindrome(String s) {
        String s2=s;
        int max=0;
        int[][] dp=new int[s.length()+1][s.length()+1];

        for (int i = 0; i <=s.length(); i++) {
            dp[0][i]=0;
        }
        for (int i = 0; i <= s.length(); i++) {
            dp[i][0]=0;
        }
        for (int i = 1; i <=s.length(); i++) {
            for (int j = 1; j <=s.length(); j++) {

            }
        }


        return max;

    }
}
