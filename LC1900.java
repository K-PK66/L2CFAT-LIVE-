class Solution {
    int[][][] minRound, maxRound;//记忆化

    public int[] earliestAndLatest(int n, int firstPlayer, int secondPlayer) {
        this.minRound = new int[n + 1][n + 1][n + 1];
        this.maxRound = new int[n + 1][n + 1][n + 1];

        if (firstPlayer < secondPlayer)//调整使搜索时保持s<f，简化代码
            return dp(n, firstPlayer, secondPlayer);
        return dp(n, secondPlayer, firstPlayer);
    }

    public int[] dp(int n, int f, int s) {
        if (minRound[n][f][s] > 0)//已记忆化
            return new int[]{minRound[n][f][s], maxRound[n][f][s]};
        if (f + s == n + 1)//最后一回合，f和s比拼
            return new int[]{1, 1};
        if (f + s > n + 1) {//调整使搜索时保持s<f，简化代码
            int[] res = dp(n, n + 1 - s, n + 1 - f);
            minRound[n][f][s] = res[0];
            maxRound[n][f][s] = res[1];
            return res;
        }

        int minRes = Integer.MAX_VALUE, maxRes = Integer.MIN_VALUE;//当前情况下最小、最大回合计算结果
        int half = (n + 1) >> 1;//中间值，下一回合人数

        if (s <= half) {//s在左侧或中间
            for (int i = 0; i < f; i++) {//f左侧人数
                for (int j = 0; j < s - f; j++) {//f和s之间的人数
                    int[] res = dp(half, i + 1, i + j + 2);//状态转移
                    minRes = Math.min(minRes, res[0] + 1);
                    maxRes = Math.max(maxRes, res[1] + 1);
                }
            }
        } else {//s在右侧
            for (int i = 0; i < f; i++) {//f左侧人数
                for (int j = 0; j < n + 1 - s - f; j++) {//f和s'之间的人数
                    int[] res = dp(half, i + 1, i + j + 2 + (s * 2 - n - 1) / 2);//状态转移
                    minRes = Math.min(minRes, res[0] + 1);
                    maxRes = Math.max(maxRes, res[1] + 1);
                }
            }
        }

        minRound[n][f][s] = minRes;//记忆化
        maxRound[n][f][s] = maxRes;//记忆化
        return new int[]{minRes, maxRes};
    }
}
