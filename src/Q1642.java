import java.util.PriorityQueue;

public class Q1642 {
    public static int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n=heights.length;
        int i = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (; i < n-1; i++) {
            if(heights[i+1]<=heights[i]){
                continue;
            }
            int diff= heights[i+1]-heights[i];
            if(bricks>=diff){
                bricks-=diff;
                pq.add(diff);
            }
            else if(ladders>0){
                if(!pq.isEmpty()){
                    int max_brick=pq.peek();
                    if(max_brick>diff){
                        bricks+=max_brick;
                        pq.remove();
                        bricks-=diff;
                        pq.add(diff);
                    }

                }
                ladders--;

            }else {
                break;
            }

        }
        return i;

    }

    public static void main(String[] args) {
        int[] heights={4,12,2,7,3,18,20,3,19};
        System.out.println(furthestBuilding(heights,10,2));
    }
}
