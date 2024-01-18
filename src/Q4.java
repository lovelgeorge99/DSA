public class Q4 {
    public static int findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int m=((l1+l2))/2;
        System.out.println("m"+m);
        int i=0;
        int j=0;

        int k=0;
        while(i<=m && j<=m){
            if(i<l1 || j<l2){
                if((nums1[i]<nums2[j])){
                    System.out.println("insd");
                    i++;
                }
                else if((nums1[i]>=nums2[j])){
                    System.out.println("indfsd");
                    j++;
                }

            }
            else if(i<l1){
                System.out.println("ds");

                i++;

            }
            else{
                j++;

            }
            k++;



        }
        System.out.println(i+" "+j);

        return k;

    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,7,8,9,10};
        System.out.println(findMedianSortedArrays(nums1,nums2));

    }
}
