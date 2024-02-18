import java.util.Arrays;
import java.util.PriorityQueue;

public class Q2402 {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int[] roomsUsedCount = new int[n];


        PriorityQueue<long[]> usedRooms = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));

        PriorityQueue<Integer> unusedRooms = new PriorityQueue<>();
        for (int room = 0; room < n; room++) {
            unusedRooms.add(room);
        }

        for (int[] meet : meetings) {
            int start = meet[0];
            int end = meet[1];


            while (!usedRooms.isEmpty() && usedRooms.peek()[0] <= start) {
                int room = (int) usedRooms.poll()[1];
                unusedRooms.add(room);
            }

            if (!unusedRooms.isEmpty()) {
                int room = unusedRooms.poll();
                usedRooms.add(new long[]{end, room});
                roomsUsedCount[room]++;
            } else {
                int room = (int) usedRooms.peek()[1];
                long endTime = usedRooms.poll()[0];
                usedRooms.add(new long[]{endTime + (end - start), room});
                roomsUsedCount[room]++;
            }
        }

        int resultRoom = -1;
        int maxUse = 0;
        for (int room = 0; room < n; room++) {
            if (roomsUsedCount[room] > maxUse) {
                maxUse = roomsUsedCount[room];
                resultRoom = room;
            }
        }

        return resultRoom;
    }
}
