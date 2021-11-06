package DP;

public class MinimumCostStep {
    public static int minCostClimbingStairs(int[] cost) {
        int case1 = 0, case2 = 0, current;
        for (int i = cost.length - 1; i >= 0; i--) {
            current = cost[i] + Math.min(case1, case2);
            case2 = case1;
            case1 = current;
        }
        return Math.min(case1, case2);
    }

    public static void main(String[] args) {
        int[] cost = new int[]{1, 2, 3, 4, 5, 6, 7};
        int result = minCostClimbingStairs(cost);
        System.out.println(result);
    }
}
