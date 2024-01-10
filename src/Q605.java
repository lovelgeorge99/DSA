public class Q605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

       int i=0;
       while(i<flowerbed.length){
           if(flowerbed[i]==1){
               i=i+2;
               if(flowerbed[i]==0){
                   n--;
               }
           }
           else{
               i=i+1;
               if(flowerbed[i]==0){
                   n--;
               }
           }
       }
       if(n==0){
           return true;
       }
       return false;

    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
