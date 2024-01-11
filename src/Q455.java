import java.util.Arrays;

public class Q455 {
    public static int findContentChildren(int[] g, int[] s) {
        int m=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=g.length-1;
        int j=s.length-1;
        while(i>=0 && j>=0){

            if(s[j]>=g[i]){

                m++;
                i--;
                j--;
            }
            else {
                i--;
            }
        }

        return m;
    }

    public static void main(String[] args) {
        int[] g={1,2 };
        int[] s={1,2,3};
        System.out.println(findContentChildren(g,s));
    }
}
