public class Q1768 {
    public static String mergeAlternately(String word1, String word2) {
        String s="";
        int i=0;
        while (i<(word1.length()+word2.length())){
            if(i<word1.length()){
                s+=word1.charAt(i);
            }
            if(i<word2.length()){
                s+=word2.charAt(i);
            }
            i++;
        }
        return s;

    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd","pq"));
    }
}
