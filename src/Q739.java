import java.util.Arrays;
import java.util.Stack;

public class Q739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] arr= new int[temperatures.length];
        Stack<Integer> s= new Stack<>();
        for (int i = temperatures.length-1; i >=0; i--) {
            while(!s.empty() && temperatures[i]>=temperatures[s.peek()]){
                s.pop();
            }
            if(s.empty()){
                arr[i]=0;
            }
            else {
                arr[i]=s.peek()-i;
            }

            s.push(i);
        }
//        for (int i = 0; i < temperatures.length-1; i++) {
//            int j=i+1;
//            int c=1;
//            while(j<temperatures.length-1 && temperatures[j]<=temperatures[i]){
//                c++;
//                j++;
//            }
//            if(temperatures[j]>temperatures[i]){
//                arr[i]=c;
//            }
//
//        }
        return  arr;
    }

    public static void main(String[] args) {
        int[] temp={89,62,70,58,47,47,46,76,100,70};
        System.out.println(Arrays.toString(dailyTemperatures(temp)));
    }
}
