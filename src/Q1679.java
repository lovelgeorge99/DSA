import java.util.Arrays;

public class Q1679 {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int count=0;
        while(i<j){
            if(nums[i]+nums[j]==k){
                i++;
                j--;
                count++;
            }
            else if(nums[i]+nums[j]>k){
                j--;
            }
            else {
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={3,1,3,4,3,3};
        System.out.println(maxOperations(nums,6));
    }
}
