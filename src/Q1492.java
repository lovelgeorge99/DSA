import java.util.ArrayList;
import java.util.List;

public class Q1492 {
    public  static int kthFactor(int n, int k) {
        List<Integer> l=new ArrayList<>();
        for (int i = 1; i <=n/2; i++) {
            if(n%i==0){
                l.add(i);
            }
        }
        l.add(n);
        System.out.println(l);
        if(l.size()<k)
        {
            return -1;
        }

        return l.get(k-1);

    }

    public static void main(String[] args) {
        System.out.println(kthFactor(2,2));
    }
}
