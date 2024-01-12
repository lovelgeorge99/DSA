public class Q283 {
    public static void moveZeroes(int[] nums) {
        int i=0;

        while(i<nums.length){
            if(nums[i]==0){
                int j=i+1;
                while(j<nums.length){
                    if(nums[j]!=0){
                        nums[i]=nums[j];
                        nums[j]=0;
                        break;
                    }
                    j++;
                }
            }
            i++;
        }

//          Optimal Solution
//        int k = 0;
//
//        for(int i : nums){
//            if(i != 0){
//                nums[k++] = i;
//            }
//        }
//
//        while(k < nums.length){
//            nums[k++] = 0;
//        }

    }

    public static void main(String[] args) {
        int[] nums={0};
        moveZeroes(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
