import java.util.ArrayList;
import java.util.List;

public class Q151 {
    public static String reverseWords(String s) {
        s=s+" ";
        char[] array= s.toCharArray();
        List<Character> l= new ArrayList<>();
        for (int i = 0; i < s.length()-1; i++) {
            if(array[i]!=' ' || array[i+1]!=' '){
                l.add(array[i]);
            }
        }
        System.out.println(l);
        String str="";
        String temp="";
        int c=0;
        for (int i = 0; i < l.size(); i++) {

         if(l.get(i)!=' '){
             temp=temp+l.get(i);
         }
         else{
             str=temp+" "+str;
             temp="";

         }
        }
        return temp+" "+str;

    }

    public static void main(String[] args) {
        String s="   the sky is blue";
        System.out.println(reverseWords(s));

    }
}
