package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1609 {

    public void solve(BT node){
        if(node==null){
            return;
        }

    }


    public boolean isEvenOddTree(BT root) {

        Queue<BT> queue= new LinkedList<>();

        queue.add(root);
        List<Integer> l= new ArrayList<>();

        while (!queue.isEmpty()){

            l.add(queue.peek().val);
            queue.poll();
            if(root.left!=null){
                queue.add(root.left);
            }
            if(root.right!=null){
                queue.add(root.right);
            }
        }
        System.out.println(l);



        return true;

    }
}
