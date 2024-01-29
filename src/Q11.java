public class Q11 {
    public static int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;

        while(i<j){
            int c=0;
            if(height[i]<height[j]){
                c=(j-i)*height[i];
                i++;
            }
            else {
                c=(j-i)*height[j];
                j--;
            }
            max=Math.max(max,c);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }
}
