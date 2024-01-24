import java.util.Arrays;

public class Q300 {
    public static int lengthOfLIS(int[] nums) {
        int[] dp= new int[nums.length];
        int m=1;
        for (int i = 0; i < dp.length; i++) {
            dp[i]=1;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <i; j++) {
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);

                    m=Math.max(dp[i],m);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return m;
    }

    public static void main(String[] args) {
        int[] arr= {0,1,0,3,2,3};
        System.out.println(lengthOfLIS(arr));
    }
}
