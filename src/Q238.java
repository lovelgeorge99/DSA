public class Q238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] left= new int[nums.length];
        int[] right= new int[nums.length];
        left[0]=1;
        for (int i = 1; i < nums.length; i++) {
            left[i]=left[i-1]*nums[i-1];
        }

        right[nums.length-1]=1;
        for (int i = nums.length-2; i >=0; i--) {
            right[i]=right[i+1]*nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=left[i]*right[i];
        }


//        for (int i = 0; i < left.length; i++) {
//            System.out.println(left[i]);
//        }
//        for (int i = 0; i < right.length; i++) {
//            System.out.println(right[i]);
//        }



//        Optimal Solution in O(1) space
//        int[] product= new int[nums.length];
//        product[0]=1;
//
//        for (int i = 1; i < nums.length; i++) {
//            product[i]=product[i-1]*nums[i-1];
//        }
//
//        int suffix=1;
//        for (int i = nums.length-1; i >=0 ; i--) {
//            product[i]=product[i]*suffix;
//            suffix=suffix*nums[i];
//        }
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(product[i]);
//        }



    return nums;
    }


    public static void main(String[] args) {
    int[] nums={1,2,3,4};
//        System.out.println(productExceptSelf(nums));
        int[] n=productExceptSelf(nums);
//        for (int i = 0; i < n.length; i++) {
//           System.out.println(n[i]);
//        }
    }
}
