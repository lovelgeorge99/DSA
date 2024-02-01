import java.util.Arrays;

public class Q2966 {
    public static  int[][] divideArray(int[] nums, int k) {
        int[][] arr=new int[nums.length/3][3];
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int j=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i][0]=nums[j++];
            arr[i][1]=nums[j++];
            arr[i][2]=nums[j++];
            if(arr[i][2]-arr[i][0]>k){
                int[][] t=new int[0][0];
                return t;
            }





        }
        return arr;

    }

    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(Arrays.deepToString(divideArray(nums,1)));
    }
}
