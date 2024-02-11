public class Q1463 {
    static int m;
    static int n;
    static int[][][] mem= new int[71][71][71];

    public static int solve(int[][] grid,int row,int c1,int c2){

        if(row>=m){
            return 0;
        }

        if(mem[row][c1][c2]!=-1){
            return mem[row][c1][c2];
        }

        int res= grid[row][c1];
        if(c1!=c2){
            res+=grid[row][c2];
        }
        int ans=0;
        for (int i = -1; i <=1 ; i++) {
            for (int j = -1; j <=1 ; j++) {
                    int newRow=row+1;
                    int newC1=c1+i;
                    int newC2=c2+j;
                    if(newC1>=0 && newC1<n && newC2>=0 && newC2<n){
                        ans=Math.max(ans,solve(grid,newRow,c1+i,c2+j));
                    }

            }
        }
        return mem[row][c1][c2]=ans+res;

    }
    public static int cherryPickup(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        for (int i = 0; i < 71; i++) {
            for (int j = 0; j < 71; j++) {
                for (int k = 0; k < 71; k++) {
                    mem[i][j][k] = -1;
                }
            }
        }
        return solve(grid,0,0,n-1);

    }

    public static void main(String[] args) {
        int[][] grid= {{3,1,1},{2,5,1},{1,5,5},{2,1,1}};
        System.out.println(cherryPickup(grid));
    }
}
