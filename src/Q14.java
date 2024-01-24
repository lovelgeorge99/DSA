import java.util.Arrays;

public class Q14 {
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String temp=strs[0];

        for (int i = 1; i < strs.length; i++) {
            int m=Math.min(temp.length(),strs[i].length());
            String s="";
            for (int j = 0; j < m; j++) {
                if(temp.charAt(j)==strs[i].charAt(j)){
                    s+=temp.charAt(j);
                }
                else{
                    break;
                }
            }
            temp=s;
        }


        return temp;
    }

    public static void main(String[] args) {
        String[] strs={"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
