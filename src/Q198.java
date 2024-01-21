public class Q198 {
    public static int rob(int[] nums) {
        int n=nums.length;
        int[] dp= new int[n+1];
        for (int i = 0; i < dp.length; i++) {
            dp[i]=0;
        }
        dp[0]=0;
        dp[1]=nums[0];

        for (int i = 2; i <=n ; i++) {

            int steal= nums[i-1]+dp[i-2];
            int skip= dp[i-1];

            dp[i]= Math.max(steal,skip);
        }
//        for (int i = 0; i < dp.length; i++) {
//            System.out.print(dp[i]+" ");
//        }
        return dp[n];
    }

    public static void main(String[] args) {
        int[] nums={2,7,9,3,1,5};
        System.out.println(rob(nums));
    }
}
