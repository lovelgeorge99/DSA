

public class Q1071 {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static String gcdOfStrings(String str1, String str2) {
        String str="";
        int gcd;
        if(!(str1+str2).equals(str2+str1) ){
            return "";
        }
        else{
            gcd = gcd(str1.length(), str2.length());
//            System.out.println(gcd);
        }
        return  str2.substring(0,gcd);
    }

    public static void main(String[] args) {
        String str1="ABABAB";
        String str2="ABAB";
        System.out.println(gcdOfStrings(str1,str2));
    }
}
