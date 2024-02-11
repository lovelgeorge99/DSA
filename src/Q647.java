public class Q647 {

    public static boolean checkPalindrome(String s,int i,int j){
        if(i>j){
            return true;
        }
        if(s.charAt(i)==s.charAt(j)){
            return checkPalindrome(s,i+1,j-1);
        }
        return false;

    }
    public static int countSubstrings(String s) {
        int n=s.length();
        int count=0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(checkPalindrome(s,i,j)){
                    count++;
                }

            }
        }
        return count;

    }

    public static void main(String[] args) {
        String s="aaa";
        System.out.println(countSubstrings(s));
    }
}
