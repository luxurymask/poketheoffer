package searchingajob.Qunar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class QunarTest1 {
	static List<Integer> list = new ArrayList<>();
	
	public static boolean isSum(int[] array, int i, int k){
		if(i < 0 || k < 0) return false;
		if(k == 0) return true;
		
		if(isSum(array, i - 1, k)) return true;
		if(isSum(array, i - 1, k - array[i])){
			list.add(array[i]);
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] array = new int[n];
		for(int i = 0;i < n;i++){
			array[i] = in.nextInt();
		}
		
		if(isSum(array, array.length - 1, k)){
			System.out.println("YES");
			Collections.sort(list);
			for(int i = 0;i < list.size() - 1;i++){
				System.out.print(list.get(i) + " ");
			}
			System.out.println(list.get(list.size() - 1));
		}else{
			System.out.println("NO");
		}
	}
}
