package searchingajob.Tencent;

import java.util.Scanner;

/**
 * 对于任意正整数k，小明有2个面额为2的k次幂的硬币。
 * 小明想知道，对于任意额度n，小明有多少种付款方法。
 */
public class TencentTest2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int dpJin, dpBujin;
		if((n & 1) == 0){
			dpJin = 1;
		}else{
			dpJin = 0;
		}
		dpBujin = 1;
		
		n >>= 1;
		int i = 1;
		while(n != 0 && i < 64){
			if((n & 1) == 0){
				dpJin = dpJin + dpBujin;
			}else{
				dpBujin = dpJin + dpBujin;
			}
			n >>= 1;
			i++;
		}
		System.out.println(dpBujin);
	}
}
