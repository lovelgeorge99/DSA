import java.util.Arrays;

public class Q2971 {

    public static long largestPerimeter(int[] nums) {
        int n=nums.length;

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        long sum=0l;
        for (int i = 0; i < n; i++) {
            sum+=nums[i];
            
        }

        for (int i = n-1; i >=2; i--) {
            System.out.println("sf");
            sum= sum-nums[i];
            if(sum>nums[i])
            {

                return sum+nums[i];
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums={1,40,1,1,30,20,1};
        System.out.println(largestPerimeter(nums));
    }
}
