public class Q605 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length-1; i=i+2) {
            if(n>0){
                if(flowerbed[i]!=1 && flowerbed[i+1]!=1)
                {
                    n--;
                }
            }


        }

        return false;
    }
}
