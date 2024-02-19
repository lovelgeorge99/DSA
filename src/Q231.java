public class Q231 {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        else {
            return (n & (n-1))==0;
        }

    }

    public static void main(String[] args) {
        int n=2;
        System.out.println(isPowerOfTwo(n));
    }
}
