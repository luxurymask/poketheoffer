package searchingajob.ChinaMerchantsBank;

import java.util.Scanner;

public class ChinaMerchantsBankTest2 {
	public static boolean isWinner(int[] array, int i, int a, int b) throws Exception{
		if(i == array.length - 1) {
			if((a + array[i]) > b){
				return true;
			}else if((a + array[i] < b)){
				return false;
			}else{
				throw new Exception();
			}
		}
		if(i == array.length - 2){
			if((a + array[i] + array[i + 1]) > b){
				return true;
			}else if((a + array[i] + array[i + 1]) < b){
				return false;
			}else{
				throw new Exception();
			}
		}
		return !isWinner(array, i + 1, b, a + array[i]) || !isWinner(array, i + 2, b, a + array[i] + array[i + 1]);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int[] array = new int[m];
		for(int i = 0;i < m;i++){
			array[i] = in.nextInt();
		}
		boolean result;
		try{
			result = isWinner(array, 0, 0, 0);
			System.out.println(result);
		}catch(Exception e){
			System.out.println(false);
		}
	}
}
