package poketheoffer;

/**
 * It turns out that the 1/2 jumpFloor is Fibonacci.
 * @author liuxl
 *
 */
public class JumpFloor {
	/**
	 * DP
	 * @param target
	 * @return
	 */
	public int jumpFloorDP(int target){
		int[] dp = new int[target + 1];
		if(target == 0 || target == 1) return 1;
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2;i <= target;i++){
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[target];
	}
	
	/**
	 * recursive.
	 * @param target
	 * @return
	 */
	public int jumpFloor(int target) {
		if(target < 0) return 0;
		if(target == 0 || target == 1) return 1;
		return jumpFloor(target - 1) + jumpFloor(target - 2);
    }
}
