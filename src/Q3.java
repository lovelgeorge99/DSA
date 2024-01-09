import java.util.HashMap;
import java.util.Map;

public class Q3 {
    public static int lengthOfLongestSubstring(String s) {
        char[] strArray = s.toCharArray();
        int max=0;
        for (int i = 0; i < s.length(); i++) {
            Map<Character,Integer> count = new HashMap<>();
            int temp=0;
            for (int j = i; j <s.length(); j++){

                if(count.containsKey(strArray[j])){
                   break;
                }
                else{
                    count.put(strArray[j],1);
                    temp=temp+1;
                }

            }
            if(temp>max){
                max=temp;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
