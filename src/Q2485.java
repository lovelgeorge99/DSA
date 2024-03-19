public class Q2485 {
    public static int pivotInteger(int n) {
        int totalSum = (n * (n + 1)) / 2;
        int lsum = 0;

        for (int i = 1; i <= n; i++) {
            int rsum = totalSum - lsum - i;

            if (lsum == rsum) {
                return i;
            }

            lsum += i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
    }
}
