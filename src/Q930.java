public class Q930 {
    public static int numSubarraysWithSum(int[] nums, int goal) {

        int i=0;
        int j=0;
        int count=0;

        int sum= 0;
        int res=0;
        while (j<nums.length){

            sum+=nums[j];
            while(i<j &&(nums[i]==0 || sum>goal)){
                if(nums[i]==1){
                    count=0;
                }
                else {
                    count++;
                }
                sum-=nums[i];
                i++;
            }

            if(sum==goal){
              res+=count+1;


            }
            j++;


        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums={0,0,0,0,0};
        System.out.println(numSubarraysWithSum(nums,0));

    }
}
