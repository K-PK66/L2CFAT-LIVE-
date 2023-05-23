class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int n = times.length, targetTime = times[targetFriend][0];//朋友数量，目标时间，即目标朋友到达的时间
        PriorityQueue<int[]> arrTime = new PriorityQueue<>((a1, a2) -> a1[0] - a2[0]);//小顶堆，按到达的顺序存放对应时间及朋友编号
        PriorityQueue<int[]> leaTime = new PriorityQueue<>((l1, l2) -> l1[0] - l2[0]);//小顶堆，按离开的顺序存放对应时间及朋友编号
        for (int i = 0; i < n; i++) {
            if (times[i][0] <= targetTime)//不晚于目标时间的到达时刻及对应编号入堆
                arrTime.offer(new int[]{times[i][0], i});
            if (times[i][1] <= targetTime)//不晚于目标时间的离开时刻及对应编号入堆
                leaTime.offer(new int[]{times[i][1], i});
        }

        PriorityQueue<Integer> chair = new PriorityQueue<Integer>();//小顶堆，存放可用椅子编号
        for (int i = 0; i < n; i++)//初始化，n个朋友最多使用n个椅子
            chair.offer(i);
        
        int[] usedChair = new int[n];//各位朋友使用的椅子编号
        int t = arrTime.peek()[0];//当前时刻
        while (t < targetTime) {//模拟
            usedChair[arrTime.poll()[1]] = chair.poll();//当前到达的朋友使用椅子
            t = arrTime.peek()[0];//时间跳转到下一朋友到达
            while (!leaTime.isEmpty() && leaTime.peek()[0] <= t)//之前的朋友归还椅子
                chair.offer(usedChair[leaTime.poll()[1]]);
        }
        return chair.poll();//目标朋友到达，输出当前的最小椅子
    }
}
