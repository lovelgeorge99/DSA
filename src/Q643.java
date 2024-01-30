public class Q643 {
    public static double findMaxAverage(int[] nums, int k) {

        int s=0;


        for (int i = 0; i < k; i++) {
                s=s+nums[i];
        }
        double sum=s;
        for (int i = k; i <nums.length; i++) {
            s=s+nums[i]-nums[i-k];
            sum=Math.max(s,sum);

        }
        return sum/k;
    }

    public static void main(String[] args) {
        int[] nums={5};
        System.out.println(findMaxAverage(nums,1));
    }
}
