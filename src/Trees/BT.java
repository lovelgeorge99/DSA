package Trees;

import java.util.*;

public class BT {

    int val;
    BT left;
    BT right;
    BT() {}
    BT(int val) { this.val = val; }
    BT(int val, BT left, BT right) {
        this.val = val;
        this.left = left;
        this.right = right;

    }
    public static BT buildTree(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        BT root = new BT(nums[0]);
        Queue<BT> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < nums.length) {
            BT curr = q.remove();
            if (i < nums.length) {
                curr.left = new BT(nums[i++]);
                q.add(curr.left);
            }
            if (i < nums.length) {
                curr.right = new BT(nums[i++]);
                q.add(curr.right);
            }
        }
        return root;
    }
    public static void printTree(BT root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static int pseudoPalindromicPaths (BT root) {
        int[] parity=new int[9];
        int  ct=0;
        Stack<Integer> st= new Stack<>();
        ct=findPaths(root,parity,ct,st);
        return ct;


    }
    public static boolean checkPalindrome(int[] arr){
        int ct=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0 && arr[i]!=0){
                ct++;
            }
        }
        if(ct>1){
            return false;
        }
        return true;
    }


    public static int findPaths(BT root,int[] arr,int c,Stack<Integer> st){
//        System.out.println("C"+c);
        if(root==null){
            return c;
        }
        st.push(root.val);
        arr[root.val-1]+=1;
        c=findPaths(root.left,arr,c,st);
        if(root.left==null && root.right==null){
//            System.out.println(Arrays.toString(arr));
            if(checkPalindrome(arr)){
               c++;
//               System.out.println(c);
            }

        }
//        System.out.println(c);
        c=findPaths(root.right,arr,c,st);
//        st.pop();
        arr[st.pop()-1]-=1;
        return c;






    }


    public static void main(String[] args) {
        int[] nums = { 9};
        BT root = buildTree(nums);
//        printTree(root);

        List<Integer> arr=new ArrayList<>();
        System.out.println("pseudo palindorme"+pseudoPalindromicPaths(root));
    }

    }