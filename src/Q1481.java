import java.util.*;

public class Q1481 {
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int c=map.getOrDefault(arr[i],0);
            map.put(arr[i],c+1);
        }
//        System.out.println(map);
        List<Integer> l = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           l.add(entry.getValue());
        }
        Collections.sort(l);
        int ans=l.size();
        for (int i = 0; i < l.size(); i++) {
            if(l.get(i)<=k){
                k=k-l.get(i);
                ans-=1;
            }
            if(k==0){
                return ans;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr={4,3,1,1,3,3,2};
        System.out.println(findLeastNumOfUniqueInts(arr,3));
    }
}
