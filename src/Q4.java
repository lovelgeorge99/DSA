public class Q4 {
    public static int findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int m=((l1+l2))/2;
        int i=0;int j=0;

        int k=0;
        while(k<m){
            if(i<l1 && j<l2){
                if((nums1[i]<nums2[j])){
                    System.out.println("i");
                    i++;
                }
                if((nums1[i]>nums2[j]) ){
                    j++;
                }

            }
            k++;

        }
        System.out.println(i+" "+j);

        return k;

    }

    public static void main(String[] args) {
        int[] nums1 = {1};
        int[] nums2 = {2,4,7,8,9,10};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
