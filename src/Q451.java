import java.util.*;

public class Q451 {
    public static String frequencySort(String s) {
        int[] map = new int[128];
        for (int i = 0; i < s.length(); i++) {
            map[s.charAt(i)]++;
        }
//        PriorityQueue<String> pq = new PriorityQueue<String>();
        PriorityQueue<String> pq = new PriorityQueue<>((s1, s2) -> Integer.compare(s2.length(), s1.length()));
     pq.add("a");
        pq.add("EE");
        pq.add("fffff");


//        for (int i = 0; i < 128; i++) {
//            if(map[i]!=0)
//            {
//                System.out.println("");
//                String temp="";
//                for (int j = 0; j < map[i]; j++) {
//                    temp=temp+(char)i;
//                }
//                pq.add(temp);
//            }
//        }
        System.out.println(pq);

        return "";

    }

    public static void main(String[] args) {
        String s= "ABtree";
        System.out.println(frequencySort(s));
    }
}
