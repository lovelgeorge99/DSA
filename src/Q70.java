public class Q70 {
    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int[] ar=new int[n+1];
        ar[1]=1;
        ar[2]=2;




        for (int i = 3; i <= n; i++) {

            ar[i]=ar[i-1]+ar[i-2];
        }

        return ar[n];
    }

    public static void main(String[] args) {
        int n=45;
        System.out.println(climbStairs(n));
    }
}
