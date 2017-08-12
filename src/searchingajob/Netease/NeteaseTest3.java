package searchingajob.Netease;

import java.util.Arrays;
import java.util.Scanner;

public class NeteaseTest3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i = 0;i < n;i++){
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		int temp = a[(n + 1) / 2];
		a[(n + 1) / 2] = a[n - 1];
		a[n - 1] = temp;
		int sum = 0;
		int i = 0, j = n - 1;
		while(i < j){
			sum += a[j] - a[i];
			j--;
			if(i < j) sum += a[j] - a[i];
			i++;
		}
		System.out.println(sum);
	}
}
