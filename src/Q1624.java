public class Q1624 {
    public static int maxLengthBetweenEqualCharacters(String s) {
    int m=-1;

        for (int i = 0; i < s.length()-1; i++) {
            int cm=-1;
            for (int j = i+1; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j)){
                    cm=j-i-1;
                }
            }
            if(cm>m){
                m=cm;
            }
        }
    
    return m;
    }

    //optimal O(n)
    public static int maxStr(String s){
        int m=-1;
        int[] arr= new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']=i;
        }
        for (int i = 0; i < s.length(); i++) {
            int c=arr[s.charAt(i)-'a']-i-1;
            if(c>m){
                m=c;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        String s="aa";
        System.out.println(maxStr(s));
    }
}
