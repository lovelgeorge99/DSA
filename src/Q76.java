import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q76 {
    public static String minWindow(String s, String t) {
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        int i=0;
        int j=0;
        int n=s.length();
        int count=t.length();
        int idx=0;
        int minWindow = Integer.MAX_VALUE;

        while (j<n){

            if(map[s.charAt(j)]>0){
                count--;
            }
            map[s.charAt(j)]--;

            while (count==0){
                int currWindow=j-i+1;
                if(currWindow<minWindow){
                    minWindow=currWindow;
                    idx=i;
                }
                map[s.charAt(i)]++;
                if(map[s.charAt(i)]>0){
                    count++;
                }
                i++;

            }
            j++;
        }

        return minWindow == Integer.MAX_VALUE ? new String() : new String(s.toCharArray(), idx, minWindow);


    }

    public static void main(String[] args) {
        String t="AsBC";
        String s="ADOBECODEBANC";


        System.out.println(minWindow(s,t));
    }
}
