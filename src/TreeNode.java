import Trees.BT;

import java.util.*;

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


//    Q1026=================================

    public static int maxAncestorDiff(TreeNode root,int m) {
          if(root==null)
          {
              return 0;
          }

          if(root.right==null && root.left==null){
              return root.val;
          }
          int left =root.val-maxAncestorDiff(root.left,m);
          int right =root.val-maxAncestorDiff(root.right,m);

          int n=Math.abs(left)-Math.abs(right);
          if(Math.abs(left)>Math.abs(right)){
              return Math.abs(left);
          }

          return Math.abs(right);


    }


//    public static boolean isEvenOddTree(TreeNode root) {
//
//        Queue<TreeNode> q= new LinkedList<>();
//
//        q.offer(root);
//        List<Integer> l= new ArrayList<>();
//
//        while (!q.isEmpty()){
//            TreeNode current = q.poll();
//            System.out.println(current.val);
//            l.add(current.val);
//
//            if(current.left!=null){
//                q.offer(current.left);
//            }
//            if(current.right!=null){
//                q.offer(current.right);
//            }
//        }
//        System.out.println(l);
//
//
//        return true;
//
//    }
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean evenLevel = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            int prev = evenLevel ? Integer.MIN_VALUE : Integer.MAX_VALUE;

            while (size-- > 0) {
                TreeNode node = queue.poll();

                if ((evenLevel && (node.val % 2 == 0 || node.val <= prev)) ||
                        (!evenLevel && (node.val % 2 == 1 || node.val >= prev))) {
                    return false;
                }

                prev = node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            evenLevel = !evenLevel;
        }

        return true;
    }
    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(10);
        TreeNode t= new TreeNode(8,t1,t2);

        TreeNode x1 = new TreeNode(3);
        TreeNode x2 = new TreeNode(2);
        TreeNode x= new TreeNode(1,x1,x2);

//        System.out.println("sum"+rangeSumBST(t,5,14));


//        Q872
//        System.out.println((leafSimilar(t, x)));

//      Q0126
//        System.out.println(isEvenOddTree(t));


    }
}
