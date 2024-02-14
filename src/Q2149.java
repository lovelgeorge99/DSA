import java.util.Arrays;

public class Q2149 {
    public static int[] rearrangeArray(int[] nums) {
        int[] plus=new int[nums.length/2];
        int l=0;int m=0;
        int[] minus=new int[nums.length/2];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                plus[l]=nums[i];
                l++;
            }
            else{
                minus[m]=nums[i];
                m++;
            }
        }
        int k=0;
        for (int i = 0; i < nums.length; i=i+2) {
            nums[i]=plus[k];
            nums[i+1]=minus[k];
            k++;
        }
        return nums;

    }

    public static void main(String[] args) {

        int[] nums={-1,1};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
}
