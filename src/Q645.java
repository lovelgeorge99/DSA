public class Q645 {
    public static  int[] findErrorNums(int[] nums) {
        int[] arr= new int[nums.length+1];

        for (int i = 0; i < nums.length; i++) {

            arr[nums[i]]=arr[nums[i]]+1;
        }
        int x=0;
        int y=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                x=i;
            }
            if(arr[i]==2){
                y=i;
            }
        }
//        System.out.println(x+" "+y);
        return new int[]{y, x};

    }

    public static void main(String[] args) {
        int[] ar={1,2,2,4};
        System.out.println(findErrorNums(ar));
    }
}
