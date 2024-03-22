/**
 * @author romeo.jerenyama
 * @created 14/02/2024 - 11:31
 */

import java.util.Arrays;
import java.util.List;

public class MaximumRewardPoints {

    public int getMaximumRewardPoints(int k, List<Integer> reward_1, List<Integer> reward_2) {
        int n = reward_1.size();

        // Handle base cases:
        if (k == 0) {
            return reward_2.stream().mapToInt(Integer::intValue).sum();
        }
        if (k == n) {
            return reward_1.stream().mapToInt(Integer::intValue).sum();
        }

        // Create and initialize DP table:
        int[][] dp = new int[n + 1][k + 1];
        int a = 0;
        for (int i = 1; i <= n; i++) {
            dp[i][0] = reward_2.get(i - 1); // Only 2nd intern does i tasks
        }

        // Efficiently build the DP table using rolling DP:
        int maxLeft, maxRight;
        for (int i = 1; i <= n; i++) {
            ;
            maxLeft = Integer.MIN_VALUE;
            maxRight = reward_1.get(i - 1); // Default: Intern 1 does task i
            for (int j = 1; j <= Math.min(k, i); j++) { // Explore options up to k tasks for Intern 1
                maxLeft = Math.max(maxLeft, dp[i - j][j - 1] + reward_1.get(i - 1));
                maxRight = Math.max(maxRight, dp[i - j][j] + reward_2.get(i - 1)); // Keep Intern 2 option
                a = j;
            }
            dp[i][a] = Math.max(maxLeft, maxRight);
        }
        return dp[n][k];
    }

    public static void main(String[] args) {
        int n = 5;
        List<Integer> reward_1 = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> reward_2 = Arrays.asList(1, 2, 3, 4, 5);
        int k = 3;

        MaximumRewardPoints solution = new MaximumRewardPoints();
        int maxPoints = solution.getMaximumRewardPoints(k, reward_1, reward_2);
        System.out.println("Maximum combined reward points: " + maxPoints); // Output: 21
    }
}

