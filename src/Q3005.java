public class Q3005 {
    public static int maxFrequencyElements(int[] nums) {
        int[] m=new int[101];
        int max=0;
        for (int i = 0; i < nums.length; i++) {
            int c=m[nums[i]]+=1;
            max=Math.max(max,c);
        }
        int s=0;
        for (int i = 0; i < 101; i++) {
            if(m[i]==max){
                s+=max;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4};
        System.out.println(maxFrequencyElements(nums));
    }
}
