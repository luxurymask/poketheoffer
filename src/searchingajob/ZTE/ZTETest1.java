package searchingajob.ZTE;

import java.util.Scanner;

public class ZTETest1 {
	public static int function(int n, int[] array1, int[] array2){
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < n;i++){
			int current = array2[i] / array1[i];
			if(current < min) min = current;
		}
		
		int result = 0;
		for(int i = 0;i < n;i++){
			result += min * array1[i];
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array1 = new int[n];
		int[] array2 = new int[n];
		for(int i = 0;i < n;i++){
			array1[i] = in.nextInt();
		}
		for(int i = 0;i < n;i++){
			array2[i] = in.nextInt();
		}
		
		System.out.println(function(n, array1, array2));
	}
}
