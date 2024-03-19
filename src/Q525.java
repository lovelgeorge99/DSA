import java.util.HashMap;

public class Q525 {
    public static int findMaxLength(int[] nums) {

        HashMap<Integer,Integer> mp= new HashMap<>();
        mp.put(0,-1);

        int res=0;
        int curSum=0;

        for (int i = 0; i < nums.length; i++) {
            curSum+=(nums[i]==1) ? 1:-1;

            if(mp.containsKey(curSum)){
                res= Math.max(res,i-mp.get(curSum));
            }else{
                mp.put(curSum,i);

            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[] nums={1,0,0,1,1};
        System.out.println(findMaxLength(nums));
    }
}
