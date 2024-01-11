import java.util.ArrayList;
import java.util.HashMap;
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




    //    Q872-------------------------------------------------
    public static  List<Integer> getLeaf(List l,TreeNode root){

          if(root==null){
              return l;
          }
          if(root.left==null && root.right==null){
              l.add(root.val);
          }
          getLeaf(l,root.left);
          getLeaf(l,root.right);

          return l;

    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();

        getLeaf(l1,root1);
        getLeaf(l2,root2);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1.equals(l2));
        return l1.equals(l2);

    }



//    Q2385==============================================
    public static HashMap<Integer,List<Integer>> convertUnDirectional(TreeNode root){
        HashMap<Integer,List<Integer>> map= new HashMap<>();

        if(root==null) {
            return map;
        }
        List<Integer> l= new ArrayList<>();
        if(root.left!=null){
            l.add(root.left.val);
        }
        if(root.right!=null){
            l.add(root.right.val);
        }

        map.put(root.val,l);
//        map.put(root.left.val,root.val);
//        map.put(root.right.val,)

        return map;

    }

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t= new TreeNode(1,t1,t2);

        TreeNode x1 = new TreeNode(3);
        TreeNode x2 = new TreeNode(2);
        TreeNode x= new TreeNode(1,x1,x2);

//        System.out.println("sum"+rangeSumBST(t,5,14));


//        Q872
//        System.out.println((leafSimilar(t, x)));

//      Q2385


    }
}
