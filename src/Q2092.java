import java.util.*;

public class Q2092 {
    public static List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        List<Integer> l= new ArrayList<>();
        l.add(0);
        l.add(firstPerson);

        Arrays.sort(meetings, Comparator.comparingInt(a -> a[2]));

        HashMap<Integer,Set<Integer>> map= new HashMap<>();
//        Set<Integer> hash_Set = new HashSet<Integer>();
        for(int[] meet:meetings){
//            map.computeIfAbsent(meet[2], key -> new Set<>()).add(new int[]{v, cost});
            if(!map.containsKey(meet[2])){
                Set<Integer> s = new HashSet<>(Arrays.asList(meet[0], meet[1]));
                map.put(meet[2],s);
            }
            else {
                Set<Integer> s= map.get(meet[2]);
                s.add(meet[1]);
                s.add(meet[0]);
                map.put(meet[2],s);
            }


        }
        System.out.println(map);
        for (Map.Entry<Integer, Set<Integer>> entry : map.entrySet()) {

            System.out.println(entry.getKey() + "/" + entry.getValue());
        }



        return  l;

    }

    public static void main(String[] args) {
        int[][] meetings={{1,2,5}, {2,3,5}, {1,5,10}};
        System.out.println(findAllPeople(6,meetings,1));
    }
}
