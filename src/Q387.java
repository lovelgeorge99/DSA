public class Q387 {
    public static int firstUniqChar(String s) {

//        for (char c : s.toCharArray()) {
//
//            arr[c-'a']++;
//        }
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s= "lleecode";
        System.out.println(firstUniqChar(s));
    }
}
