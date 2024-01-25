public class Q28 {
    public static int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()){
            return -1;
        }
        int i=0;
        int j=0;
        while (i<haystack.length() && j<needle.length()){
            if(haystack.charAt(i)!=needle.charAt(j)){
                i=i+1-j;
                j=0;
            }
            else {
                i++;
                j++;
            }
        }
        if(j!=needle.length()){
            System.out.println(j);
            return -1;
        }
        return i-j;
    }

    public static void main(String[] args) {
        String hay="hello";
        String needle="ll";
        System.out.println(strStr(hay,needle));
    }
}
