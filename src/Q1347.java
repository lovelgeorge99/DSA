import java.util.HashMap;

public class Q1347 {



    public static int minSteps(String s, String t) {
        int count=0;

//        HashMap<Character,Integer> map= new HashMap<>();
//
//
//
//        for (int i = 0; i < s.length(); i++) {
//            if(map.containsKey(s.charAt(i))){
//                map.put(s.charAt(i),map.get(s.charAt(i))+1);
//            }
//            else{
//                map.put(s.charAt(i),1);
//            }
//
//
//    }
//        for (int i = 0; i < t.length(); i++) {
//            if(map.containsKey(t.charAt(i)) && (map.get(t.charAt(i))>=1)){
//                map.put(t.charAt(i),map.get(t.charAt(i))-1);
//            }
//            else {
//                count++;
//            }
//        }

//        optimising the soluton

        int[] ch= new int[26];
        for (int i = 0; i < s.length(); i++) {
            ch[s.charAt(i)-'a']+=1;
        }
        for (int i = 0; i < t.length(); i++) {
            if(ch[t.charAt(i)-'a'] != 0){
                ch[t.charAt(i)-'a']-=1;
            }
            else{
                count++;
            }
        }
        return count;

}

    public static void main(String[] args) {
        String s="bba";
        String t="bab";
        System.out.println(minSteps(s,t));
    }
}
