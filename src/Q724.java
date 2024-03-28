public class Q724 {
    public int pivotIndex(int[] nums) {
        int tsum=0;
        for (int i = 0; i < nums.length; i++) {
            tsum+=nums[i];
        }
        int lsum=0;
        for (int i = 0; i < nums.length; i++) {
            int rsum=tsum-lsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            lsum+=nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        Q724 q= new Q724();
        int[] nums={1,7,3,6,5,6};
        System.out.println(q.pivotIndex(nums));

    }
}
