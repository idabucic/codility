package com.hr.ida.codility.lessons.lesson15;

//Dynamic programming example from reading material
public class CoinChanging {
	public int solution(int[] C, int k) {
		int n = C.length;
		int[][] dp = new int[n + 1][k + 1];
		for (int i = 1; i <= k; i++) {
			dp[0][i] = Integer.MAX_VALUE;
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 0; j <= C[i - 1]; j++) {
				dp[i][j] = dp[i - 1][j];
			}
			for (int j = C[i - 1]; j < k + 1; j++) {
				dp[i][j] = Math.min(dp[i][j - C[i - 1]] + 1, dp[i - 1][j]);
			}
		}
		return dp[n][k];

	}

}
