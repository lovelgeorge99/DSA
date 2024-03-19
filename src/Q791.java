import java.util.HashMap;

public class Q791 {
    public static String customSortString(String order, String s) {
        HashMap<String,Integer> m= new HashMap<>();
        int[] map= new int[26];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)-'a']+=1;
        }
        String str="";
        for (int i = 0; i < order.length(); i++) {
            int n =map[order.charAt(i)-'a'];
            if(n!=0){
                map[order.charAt(i)-'a']=0;
                for (int j = 0; j < n; j++) {
                    str=str+order.charAt(i);
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            if(map[i]!=0){
                for (int j = 0; j < map[i]; j++) {
                    str=str+(char)(i+'a');
                }
            }
        }
        return str;
                
    }

    public static void main(String[] args) {
        String order="bcafg";
        String s="abcd";
        System.out.println(customSortString(order,s));
    }
}
