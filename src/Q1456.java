import java.util.HashMap;
import java.util.Map;

public class Q1456 {
    public static int maxVowels(String s, int k) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('a',1);
        m.put('e',1);
        m.put('i',1);
        m.put('o',1);
        m.put('u',1);
        int c=0;
        for (int i = 0; i < k; i++) {
            if(m.containsKey(s.charAt(i))){
                c++;
            }
        }
        int max=c;
        for (int i = k; i < s.length(); i++) {
            if(m.containsKey(s.charAt(i))){
                c++;
            }
            if(m.containsKey(s.charAt(i-k))){
                c--;
            }
            max=Math.max(max,c);
        }
        return max;

    }

    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(maxVowels(s,3));
    }
}
