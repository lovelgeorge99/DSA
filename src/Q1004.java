public  class Q1004 {
    public static int longestOnes(int[] nums, int k) {
        int i=0;
        int j=0;
        int count=0;
        while (j<nums.length){
            if(nums[j]==1){
                j++;
                count++;
            }
            else{
                if(k!=0){
                    k--;
                    j++;
                    count++;
                }
                else{
                    if(nums[i]==0){
                        System.out.println(count);
                        count--;
                        k++;
                    }

                    i++;

                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;
        System.out.println(longestOnes(nums,k));
    }
}
