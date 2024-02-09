public class Q1043 {
    public static int solve(int i,int[] arr,int k,int n,int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int res=0;
        int cur_max=-1;
        for (int j = i; j <n && j-i+1<=k ; j++) {
             cur_max=Math.max(cur_max,arr[j]);
             res=Math.max(res,((j-i+1)*cur_max)+solve(j+1,arr,k,n,dp));
        }
        return dp[i]=res;
    }
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        int n=arr.length;
        int[] dp=new int[501];
        for (int i = 0; i < 501; i++) {
            dp[i]=-1;
        }
        int m=solve(0,arr,k,n,dp);

        return m;


    }

    public static void main(String[] args) {
        int[] arr = {1,15,7,9,2,5,10};
        int k = 3;
        System.out.println(maxSumAfterPartitioning(arr,k));
    }
}
