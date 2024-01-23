public class Q26 {
    public static  int removeDuplicates(int[] nums) {
        int m=nums[nums.length-1];
        int i=0;
        int j=1;
        int c=1;
        while(i<nums.length && j<nums.length && j!=m){
            if(nums[i]==nums[j]){
                j++;
            }
            else{
                nums[i+1]=nums[j];
                c++;
                i++;
                j++;
            }
        }
        for (int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]+" ");
        }
    return c;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,444444};
        System.out.println(removeDuplicates(nums));
    }
}
