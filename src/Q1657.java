import java.util.Arrays;

public class Q1657 {
    public static boolean closeStrings(String word1, String word2) {
        int[] ch1 = new int[26];
        int[] ch2 = new int[26];

        if(word1.length()!= word2.length()){
            return false;
        }

        for (int i = 0; i < word1.length(); i++) {
            ch1[word1.charAt(i)-'a']+=1;

        }
        for (int i = 0; i < word1.length(); i++) {
            ch2[word2.charAt(i)-'a']+=1;

        }
        for (int i = 0; i < 26; i++) {
            if ((ch1[i] == 0 && ch2[i] != 0) || (ch1[i] != 0 && ch2[i] == 0)) {
                return false;
            }
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < 26; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String word1 ="abbzzca";
        String word2 ="babzzcz";
        System.out.println(closeStrings(word1,word2));
    }

}
