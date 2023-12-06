class Solution {
    public int completeRound(int[] gas, int[] cost) {
        int st = -1, sum = 0;
        asum = 0;
        for (int i = 0; i < gas.length; i++) {
            gas[i] -= cost[i];
            sum += gas[i];
            asum += gas[i];
            if (asum < 0) {
                asum = 0;
                st = i + 1;
            } else if (st == -1) {
                st = i;
            }
        }
        if (sum < 0) {
            return -1;
        }
        return st;
    }
}