package searchingajob.Sohu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SohuTest1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] nums = new int[m];
		int i = 0;
		while(in.hasNextInt()){
			nums[i++] = in.nextInt();
		}
		List<Integer> list = new ArrayList<Integer>();
		i = 0;
		int j = 0;
		int k = 0;
		while(j < n){
			int l = 0;
			if(k == m) k = 0;
			do{
				if(j == n) break;
				list.add(nums[k]);
				System.out.println(nums[k]);
				j++;
				l++;
			}while(l < list.get(i));
			k++;
			i++;
		}
	}
}
