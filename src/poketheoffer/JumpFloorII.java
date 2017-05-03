package poketheoffer;

public class JumpFloorII {
	public int jumpFloorII(int target) {
        int[] dp = new int[target + 1];
		if(target == 0 || target == 1) return 1;
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2;i <= target;i++){
        	for(int j = 1;j < i;j++){
        		dp[i] += dp[j];
        	}
        }
        return dp[target];
    }
}
