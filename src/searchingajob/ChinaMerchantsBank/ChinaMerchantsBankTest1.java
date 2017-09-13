package searchingajob.ChinaMerchantsBank;

import java.util.Scanner;

public class ChinaMerchantsBankTest1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int bigger = a > b ? a : b;
		int smaller = a > b ? b : a;
		int n = in.nextInt();
		int count = 0;
		int i = 1;
		int pub = bigger;
		while(true){
			if((bigger * i) % smaller == 0){
				pub = bigger * i;
				break;
			}
			i++;
		}
		if(pub > n){
			System.out.println(0);
			return;
		}
		int j = 1;
		while((pub * j) <= n){
			count++;
			j++;
		}
		System.out.println(count);
	}
}
