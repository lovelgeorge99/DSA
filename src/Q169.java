public class Q169 {
    public static int majorityElement(int[] nums) {
        int count=0;
        int c=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==c){
                count++;
            }
            else {
                count--;

                    c=nums[i];
                
            }

        }
        return c;
    }

    public static void main(String[] args) {
        int[]  nums={3,2,3,2,3,3,2};
        System.out.println(majorityElement(nums));
    }
}
