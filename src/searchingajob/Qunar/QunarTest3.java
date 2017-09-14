package searchingajob.Qunar;

import java.util.Scanner;

public class QunarTest3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int[][] desk = new int[m][n];
		
		for(int i = 0;i < m;i++){
			String s = in.next();
			char[] array = s.toCharArray();
			for(int j = 0;j < array.length;j++){
				if(array[i] == '.'){
					desk[i][j] = 1;
				}else{
					desk[i][j] = 0;
				}
			}
		}
		
		int count = 0;
		for(int i = 0;i < m;i++){
			for(int j = 0;j < n;j += 2){
				if(desk[i][j] == 1){
					count++;
				}
			}
		}
		
		int max = count;
		
		for(int i = 0;i < m;i++){
			for(int j = 0;j < n;j += 2){
				if(desk[i][j] == 1){
					count++;
				}
			}
		}
		
		max = Math.max(max, count);
		
		System.out.println(max);
	}
}
