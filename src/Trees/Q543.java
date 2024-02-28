package Trees;

public class Q543 {
    public int diameterOfBinaryTree(BT root) {
        if (root == null)
            return 0;

        int[] result = { Integer.MIN_VALUE };
        solve(root, result);

        return result[0];
    }

    public int solve(BT root, int[] result) {
        if (root == null)
            return 0;

        int left = solve(root.left, result);
        int right = solve(root.right, result);

        result[0] = Math.max(result[0], left + right);

        return Math.max(left, right) + 1;
    }
}
