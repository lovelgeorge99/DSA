package Trees;

public class Q100 {
    public void traversal(BT p,BT q,boolean ans){
        if(p==null && q == null){
            return;
        }
        traversal(p.left,q.left,ans);

        if(p.val!=q.val){
            ans =false;

        }
        traversal(p.right,q.right,ans);


    }
    public boolean isSameTree(BT p, BT q) {
        boolean ans=true;
        traversal(p,q,ans);
        return ans;
    }

}
