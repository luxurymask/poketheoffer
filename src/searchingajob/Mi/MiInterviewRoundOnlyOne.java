package searchingajob.Mi;

/**
 * 9月5号小米六期一轮游。
 * @author liuxl
 */
public class MiInterviewRoundOnlyOne {
	/**
	 * 版本大小比较，版本格式10.1.3.0，10.1.3.0 > 10.1.3。
	 * @param version1
	 * @param version2
	 * @return
	 * @throws Exception 
	 */
	public static int versionCompare(String version1, String version2) throws Exception{
		if(version1 == null || version2 == null) throw new Exception();
		String[] array1 = version1.split(".");
		String[] array2 = version2.split(".");
		int i;
		for(i = 0;i < array1.length && i < array2.length;i++){
			int num1 = Integer.parseInt(array1[i]);
			int num2 = Integer.parseInt(array2[i]);
			if(num1 > num2) return 1;
			if(num1 < num2) return -1;
		}
		if(i == array1.length && i == array2.length) return 0;
		return (i != array1.length) ? 1 : -1;
	}
	
	/**
	 * n级台阶，可以走1步或者2步，有多少种走法。
	 * @param n
	 * @return
	 */
	public static int stairs(int n){
		if(n <= 0) return 0;
		int[] dp = new int[n];
		dp[0] = 1;
		dp[1] = 2;
		for(int i = 2;i < n;i++){
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n - 1];
	}
	
	/**
	 * 有pattern s1，其中*代表0个或任意个*前的字符，问s2是否符合pattern。
	 * @param pattern
	 * @param target
	 * @return
	 */
//	public static boolean isSame(String pattern, String target){
//		if(pattern == null || target == null) return false;
//		int i = 0, j = 0;
//		char lastChar = '\u0000';
//		while(i < pattern.length() && j < target.length()){
//			char patternChar = pattern.charAt(i);
//			char targetChar = target.charAt(j);
//			if(patternChar == targetChar){
//				lastChar = patternChar;
//				i++;
//				j++;
//				continue;
//			}
//			if(patternChar != '*' || lastChar == '\u0000') return false;
//			while(lastChar == targetChar && j < target.length()){
//				j++;
//			}
//		}
//	}
}
