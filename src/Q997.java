import java.util.Arrays;

public class Q997 {
//    [1,3],[1,4],[2,3],[2,4],[4,3]]
    public static int findJudge(int n, int[][] trust) {
        if(trust.length==0){
            return -1;
        }
        int[] arr= new int[n+1];
//        int m=0;
//        int ans=-1;
        for (int i = 0; i < trust.length; i++) {
            arr[trust[i][1]]++;
            arr[trust[i][0]]--;

//            m=Math.max(m,arr[trust[i][1]]);
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < n+1; i++) {
            if(arr[i]==n-1){
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[][] trust={};
        System.out.println(findJudge(1,trust));


    }
}
