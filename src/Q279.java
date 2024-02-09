public class Q279 {
    public static  int solve(int n,int[] arr){
        int m=Integer.MAX_VALUE;
        if(n==0){
            return 0;
        }
        if(arr[n]!=-1){
            return arr[n];
        }
        for (int i = 1; i*i<= n; i++) {
            int result= 1+solve(n-i*i,arr);
            m= Math.min(result,m);

        }
        return arr[n]=m;

    }
    public static int numSquares(int n) {
        int[] arr= new int[n+1];
        for (int i = 0; i < n+1; i++) {
            arr[i]=-1;
        }
        

        return solve(n,arr);
    }

    public static void main(String[] args) {
        int n = 12;
        int res = numSquares(n);
        System.out.println(res);
    }
}
