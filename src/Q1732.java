public class Q1732 {
    public static int largestAltitude(int[] gain) {
    int max=0;
    int c=0;
        for (int i = 0; i < gain.length; i++) {
            c=c+gain[i];
            max=Math.max(max,c);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
}
