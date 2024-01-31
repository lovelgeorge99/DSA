public class Q724 {
    public int pivotIndex(int[] nums) {
    int i=0;
    int j= nums.length-1;
    int left=nums[i];
    int right=nums[j];
    while (i<j && i+j<nums.length-1){
        if(left==right){
            return i+1;
        }


        else if(left>right){

            right=right+nums[j];
            j--;

        }
        else if(left<right){

            left=left+nums[i];
            i++;

        }
    }
    return -1;
    }

    public static void main(String[] args) {
        Q724 q= new Q724();
        int[] nums={1,7,3,6,5,6};
        System.out.println(q.pivotIndex(nums));

    }
}
