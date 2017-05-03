package poketheoffer;

public class RectCover {
	/**
	 * just like the former two.
	 * @param target
	 * @return
	 */
	public int rectCover(int target) {
		int[] dp = new int[target + 1];
        if(target == 0) return 0;
		if(target == 1) return 1;
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2;i <= target;i++){
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[target];
    }
}
