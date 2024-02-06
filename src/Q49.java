import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        int n= strs.length;
        boolean[] flag= new boolean[n];
        int i=0;
        List<List<String>> s = new ArrayList<>();
        while (i<n){

            if(!flag[i]){
                List<String> temp = new ArrayList<>();
                int j=i;
                while (j<n){
                    if(!flag[j] && hashString(strs[i],strs[j])){
                        temp.add(strs[j]);
                        flag[j]=true;

                    }
                    j++;
                }
                s.add(temp);
            }
            i++;
        }
        return  s;


    }

    public static String sortString(String inputString)
    {
        // Converting input string to character array
        char tempArray[] = inputString.toCharArray();

        // Sorting temp array using
        Arrays.sort(tempArray);

        // Returning new sorted string
        return new String(tempArray);
    }

    public static boolean hashString(String check,String inputString )
    {
        int[] al= new int[26];
        if(check.length()==inputString.length()){
            for (int i = 0; i < check.length(); i++) {
                al[check.charAt(i)-'a']++;
                al[inputString.charAt(i)-'a']--;
            }

            for (int i = 0; i < al.length; i++) {
                if(al[i]!=0){
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s="lovel";
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strs));


    }
}
