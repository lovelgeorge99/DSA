import java.util.HashMap;
import java.util.Map;

public class Q1704 {
    public static boolean halvesAreAlike(String s) {
        Map<Character, Integer> m = new HashMap<>();
        m.put('a',1);
        m.put('e',1);
        m.put('i',1);
        m.put('o',1);
        m.put('u',1);
        m.put('A',1);
        m.put('E',1);
        m.put('I',1);
        m.put('O',1);
        m.put('U',1);
        int c1=0;
        int c2=0;
        int l=(s.length()/2);
        int j=l;
        System.out.println(j);
        int i=0;
        while (j<s.length()){
            if(m.containsKey(s.charAt(i))){
                System.out.println("c");
                c1++;

            }
            if(m.containsKey(s.charAt(j))){
                c2++;

            }
            i++;
            j++;
        }
        if(c1==c2){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="AbCdEfGh";
        System.out.println(halvesAreAlike(s));

    }
}
