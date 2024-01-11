public class Q3000 {
    public static  int areaOfMaxDiagonal(int[][] dimensions) {
        int maxArea=0;
        double d=0;
        for (int i = 0; i < dimensions.length ;i++) {
            int temp=( dimensions[i][0]*dimensions[i][0])+( dimensions[i][1]*dimensions[i][1]);
            double diag=Math.sqrt(temp);
//            System.out.println(diag);
            if(diag>d){
                d=diag;
                int curArea= dimensions[i][0]*dimensions[i][1];
                maxArea=curArea;

            }
            else if(diag==d){
                int curArea= dimensions[i][0]*dimensions[i][1];
                if(curArea>maxArea){
                    maxArea=curArea;
                }

            }



        }

        return maxArea;


    }

    public static void main(String[] args) {
        int[][] d= {{6,5},{8,6},{2,10}};
        System.out.println(areaOfMaxDiagonal(d));
    }
}
