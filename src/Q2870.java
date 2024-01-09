import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q2870 {
    public static int minOperations(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();

        for(int i:nums){
            if(count.containsKey(i)){
                int x=count.get(i)+1;
                count.put(i,x);
            }
            else{
                count.put(i,1);
            }
        }
        int value=0;
        for(Map.Entry<Integer, Integer> entry: count.entrySet()) {{
            int x = entry.getValue();
            if(x==1){
                return -1;
            }
            if(x%3==1){
                value=value+(x/3)-1;
                value=value+2;
            }
            else {
                value=value +(x/3);
                value=value+((x%3)/2);
            }

        }}

        return value;

    }

    public static void main(String[] args) {

        int[] cost={14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        System.out.println(minOperations(cost));


    }

}
