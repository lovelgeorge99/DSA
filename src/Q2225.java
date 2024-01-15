import java.util.*;

public class Q2225 {
    public static List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> l = new ArrayList<>();
        HashMap<Integer,Integer> winner = new HashMap<>();
        HashMap<Integer,Integer> looser = new HashMap<>();
        for (int i = 0; i < matches.length; i++) {
            if(winner.containsKey(matches[i][0])){
                winner.put(matches[i][0],winner.get(matches[i][0])+1);
            }
            else{
                winner.put(matches[i][0],1);
            }
            if(looser.containsKey(matches[i][1])){
                looser.put(matches[i][1],looser.get(matches[i][1])+1);
            }
            else{
                looser.put(matches[i][1],1);
            }


        }
        List<Integer> win= new ArrayList<>();
        List<Integer> lose= new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : winner.entrySet()) {
            int key = entry.getKey();
            if(!looser.containsKey(key)){
                win.add(key);
            }

        }
        for (Map.Entry<Integer, Integer> entry : looser.entrySet()) {
            int key = entry.getKey();
            if(looser.get(key)==1){
                lose.add(key);
            }

        }

//        System.out.println(looser);
        Collections.sort(win);
        Collections.sort(lose);
        l.add(win);
        l.add(lose);

        return l;
    }
//
    public static void main(String[] args) {
        int[][] matches={{1,3},{6,3},{5,4},{2,4}};
        System.out.println(findWinners(matches));
    }
}
