import java.util.*;

public class Q787 {
    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        int[] minDistance = new int[n];
        Arrays.fill(minDistance, Integer.MAX_VALUE);

        Map<Integer, List<int[]>> adjList = new HashMap<>();

        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int cost = flight[2];

            adjList.computeIfAbsent(u, key -> new ArrayList<>()).add(new int[]{v, cost});
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{src, 0});
        minDistance[src] = 0;

        int level = 0;

        while (!queue.isEmpty() && level <= k) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int u = current[0];
                int d = current[1];

                List<int[]> neighbors = adjList.getOrDefault(u, Collections.emptyList());
                for (int[] neighbor : neighbors) {
                    int v = neighbor[0];
                    int cost = neighbor[1];

                    if (minDistance[v] > d + cost) {
                        minDistance[v] = d + cost;
                        queue.offer(new int[]{v, d + cost});
                    }
                }
            }
            level++;
        }

        return minDistance[dst] == Integer.MAX_VALUE ? -1 : minDistance[dst];


        
    }

    public static void main(String[] args) {
        int[][] flights={{0,1,100},{1,2,100},{0,2,500}};
        int k=0;
        int n=3;
        int src=0;
        int dst=2;
        System.out.println(findCheapestPrice(n,flights,src,dst,k));
    }
}
