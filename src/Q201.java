public class Q201 {
    public static int rangeBitwiseAnd(int left, int right) {

        while (left<right){
            right=right &(right-1);
        }
        return right;

    }

    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5,7));
    }
}
