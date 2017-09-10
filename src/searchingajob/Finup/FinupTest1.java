package searchingajob.Finup;

import java.util.Arrays;
import java.util.Scanner;

public class FinupTest1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int[] array = new int[3];
		for(int i = 0;i < 3;i++){
			array[i] = in.nextInt();
		}
		Arrays.sort(array);
		
		if(array[0] == 0 && array[1] == 0 && array[2] == 0){
			System.out.println("0");
			return;
		}else if(array[0] == 0 && array[1] == 0){
			System.out.println(array[2]);
			return;
		}else if(array[0] == 0){
			System.out.println(array[1] + array[2]);
			return;
		}
		
		int i = 0;
		int first = 0;
		while(i < 3 && array[i] == 1){
			first++;
			i++;
		}

		int result = 1;
		
		if(first == 0){
			for(int j = 0;j < 3;j++){
				result *= array[j];
			}
		}else if(first == 1){
			first = first + array[1];
			result *= first;
			result *= array[2];
		}else{
			result += first;
			result += array[2];
		}
		
		System.out.println(result);
	}
}
