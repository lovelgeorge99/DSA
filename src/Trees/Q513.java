package Trees;

public class Q513 {
    int mdept;
    int ans;
    public void solve(BT node,int cdept){
        if(node==null){
            return;
        }
        if(cdept>mdept){
            mdept=cdept;
            ans=node.val;
        }
        solve(node.left,cdept+1);
        solve(node.right,cdept+1);
    }
    public int findBottomLeftValue(BT root) {
        mdept=Integer.MIN_VALUE;

        solve(root,0);
        return ans;


    }

}
