import java.util.Arrays;

public class Q66 {
    public static int[] plusOne(int[] digits) {
        int last=digits[digits.length-1];
        int c=0;
        if(last==9){
            for (int i = digits.length-1; i >=0 ; i--) {
                 c=(digits[i]+1);
                if(c!=10){
                    digits[i]=c;
                    break;
                }
                else{
                    digits[i]=0;

                }

            }
            if(c==10){
                int[] res=new int[digits.length+1];
                res[0]=1;
                for (int i = 0; i < digits.length; i++) {
                    res[i+1]=digits[i];
                }
                return res;
            }
        }

        else{
            digits[digits.length-1]+=1;
        }

        return digits;
    }


    public static void main(String[] args) {
        int[] digits={1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
