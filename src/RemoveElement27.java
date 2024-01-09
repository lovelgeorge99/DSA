import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
        int[] cost={3,2,2,3};
        int k=3;
        int count=0;
        int l=0;

       while(l<cost.length) {
            if(cost[l]==k){
                count++;
                int j=l;
                while(j<(cost.length)-1){
                    if(cost[j+1]==k){
                        j++;
                    }
                    else{
                        cost[l]=cost[j+1];
                        l++;
                        j++;
                    }

                }

            }
            l++;

        }
        for (int i = 0; i < cost.length; i++) {
            System.out.println(cost[i]);
        }
        System.out.println("Count "+count);
    }
}
