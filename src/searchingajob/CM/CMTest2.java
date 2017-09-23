package searchingajob.CM;

import java.util.Scanner;

/**
 * n个人排名，允许名次并列，有多少种排法。
 * 初始状态转移矩阵：
 * 纵轴i：有多少个人排名。横轴j：多少个名次。(i >= j)
 *    1  2  3  4  5  6  7  8  9  ...
 * 1  1  0  0  0  0  0  0  0  0  ...
 * 2  1
 * 3  1
 * 4  1
 * 5  1
 * 6  1
 * 7  1
 * 8  1
 * 9  1
 * .
 * .
 * .
 *
 * 状态转移：i个人排出j个名次的排法个数 = (i - 1)个人排出j个名次 * 当前人的j种选择 + (i - 1)个人排出(j - 1)个名次 * 当前人的j种选择。
 * 因此，填好状态转移矩阵：
 * 
 *    1     2     3     4     5     6     7     8     9     ...
 * 1  1     0     0     0     0     0     0     0     0     ...
 * 2  1     2     0     0     0     0     0     0     0     ...
 * 3  1     6     6     0     0     0     0     0     0     ...
 * 4  1     14    36    24    0     0     0     0     0     ...
 * 5  1     30    150   240   120   0     0     0     0     ...
 * 6  1     62    540   1560  1800  720   0     0     0     ...
 * 7  1     ...   ...   ...   ...   ...   ...   ...   ...   ...
 * 8  1     ...   ...   ...   ...   ...   ...   ...   ...   ...  
 * 9  1     ...   ...   ...   ...   ...   ...   ...   ...   ...
 * .
 * .
 * .
 * 
 */
public class CMTest2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int[][] dp = new int[101][101];
		for(int i = 1;i < 101;i++){
			for(int j = 1;j <= i;j++){
				if(j == 1) dp[i][j] = 1;
				else dp[i][j] = j * dp[i - 1][j] + j * dp[i - 1][j - 1];
			}
		}
		for(int i = 0;i < m;i++){
			int n = in.nextInt();
			int sum = 0;
			for(int j = 1;j <= n;j++){
				sum += dp[n][j];
			}
			System.out.println(sum);
		}
	}
}
