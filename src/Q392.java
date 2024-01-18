public class Q392 {
    public static boolean isSubsequence(String s, String t) {
        if(s.length()<=t.length()){

            int i=0;
            int j=0;
            while(i<s.length() && j<t.length()){
                if(s.charAt(i)!=t.charAt(j)){
                    j++;
                }
                else{
                    j++;
                    i++;
                }
            }
//           System.out.println(i);
            if(i==s.length()){
                return true;
            }
        }


        return false;

    }

    public static void main(String[] args) {
        String s="abc";
        String t="asdnbsc";
        System.out.println(isSubsequence(s,t));
    }
}
