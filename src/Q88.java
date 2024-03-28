import java.util.Arrays;

public class Q88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int s=m+n-1;

        while (j>=0){
            if(nums1[i]<nums2[j]){
                nums1[s]=nums2[j];
                j--;
            }
            else{
                nums1[s]=nums1[i];
                i--;
            }
            s--;
            System.out.println(Arrays.toString(nums1));


        }
    }

    public static void main(String[] args) {
        int[] nums1={0};
        int[] nums2={1};
        merge(nums1,0,nums2,1);
    }
}
