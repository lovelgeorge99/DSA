import java.util.Arrays;

public class Q746 {
//    public int solve(int[] cost,int i,int j,int n){
//        if(i>n || j>n){
//            return 0;
//        }
//        return Math.min(solve())
//    }
    public static int minCostClimbingStairs(int[] cost) {
        int[] dp=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];

        for (int i = 2; i < cost.length; i++) {
            dp[i]=Math.min((cost[i]+dp[i-1]),cost[i]+dp[i-2]);
        }
        System.out.println(Arrays.toString(dp));
        return Math.min(dp[cost.length-1],dp[cost.length-2]);
    }

    public static void main(String[] args) {
        int[] cost={1,100};
        System.out.println(minCostClimbingStairs(cost));
    }
}
