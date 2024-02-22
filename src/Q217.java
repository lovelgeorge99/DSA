import java.util.HashMap;

public class Q217 {
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int v= map.getOrDefault(nums[i],0);
            map.put(nums[i],v+1);
            if(map.get(nums[i])==2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(containsDuplicate(nums));
    }
}
