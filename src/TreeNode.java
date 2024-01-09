import java.util.ArrayList;
import java.util.List;

public class TreeNode {

      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;

 }

    public static int rangeSumBST(TreeNode root, int low, int high) {
         int sum=0;
         if(root==null){
             return 0;
         }
         if(root.val>=low && root.val<=high){
             sum+=root.val;
         }


         return  sum+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
    }



//    Q872

    public int getLeaf(TreeNode root){
        List<Integer> l= new ArrayList();

        if(root.left==null && root.right==null){
            l.add(root.val) ;
        }
        int left=getLeaf(root.left);
        int right=getLeaf(root.right);

        return 0;

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        int val1=root1.val;
        int val2=root2.val;
        if(root1.left==null && root1.right==null){
             val1= root1.val;
        }

        if(root2.left==null && root2.right==null){
            val2= root2.val;
        }
        if(val1==val2){

        }



    return false;

    }

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(5);
        TreeNode t2 = new TreeNode(15);
        TreeNode t= new TreeNode(10,t1,t2);
        System.out.println("sum"+rangeSumBST(t,5,14));



    }
}
