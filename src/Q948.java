import java.util.Arrays;

public class Q948 {
    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int s=0;
        int m=0;
        int i=0;
        int j=tokens.length-1;
        while(i<=j){

            if(power>=tokens[i]){
                s+=1;
                power=power-tokens[i];
                System.out.println(power);
                i++;
            }
            else{

                power=power+tokens[j];
                System.out.println(power);
                s-=1;
                j--;
            }
            m=Math.max(m,s);

        }
        return s;
    }

    public static void main(String[] args) {
        int[] tokerns={100,200,300,400};
        System.out.println(bagOfTokensScore(tokerns,200));
    }
}
