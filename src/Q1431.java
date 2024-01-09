import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
//        boolean[] arr= new boolean[candies.length];
        int m=0;
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>m){
                m=candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if((candies[i]+extraCandies)>=m){
               l.add(true);

            }
            else{
                l.add(false);
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies,3));
    }
}
