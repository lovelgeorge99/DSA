public class Q268 {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int sum= (n * (n + 1)) / 2;
        int temp=0;
        for (int i = 0; i < nums.length; i++) {
            temp+=nums[i];
        }
        return sum-temp;
    }

    public static void main(String[] args) {
        int[] nums={0,1};
        System.out.println(missingNumber(nums));

    }
}
