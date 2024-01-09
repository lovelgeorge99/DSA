public class MinCostClimbingStairs {
    public static  int minCostClimbingStairs(int[] cost) {
        int sum=0;
        int i=0;
       while(i<(cost.length-1)){
            if(cost[i]<cost[i+1]){
                sum=sum+cost[i];
                i=i+2;

            }
            else {
                sum=sum+cost[i+1];
                i=i+1;
            }
        }
       return  sum;

    }
    public static void main(String[] args) {
        int[] cost={10,15,20};
        System.out.println(minCostClimbingStairs(cost));


    }
}

