public class Q1750 {
    public static int minimumLength(String s) {
        int n= s.length();
        int i=0;
        int j=n-1;

        while(i<j && s.charAt(i)==s.charAt(j)){
            char c = s.charAt(i);

            while(s.charAt(i)==c && i<j) {
                i++;


            }
            while(s.charAt(j)==c && j>=i){
                j--;

            }



//            System.out.println(c);

        }
        return j-i+1;
    }

    public static void main(String[] args) {
        String s= "cac";
        System.out.println(minimumLength(s));
    }
}
