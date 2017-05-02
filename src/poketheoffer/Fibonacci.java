package poketheoffer;

public class Fibonacci {
	/**
	 * non-recursive.
	 * @param n
	 * @return
	 */
	public int fibonacci2(int n){
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n == 2) return 1;
		int[] result = new int[n];
		result[0] = 1;
		result[1] = 1;
		for(int i = 2;i < n;i++){
			result[i] = result[i - 1] + result[i - 2];
		}
		return result[n - 1];
	}
	
	/**
	 * recursive.
	 * @param n
	 * @return
	 */
	public int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		if(n == 2) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
