package poketheoffer;

public class ReOrderArray {
	public static void reOrderArray(int [] array) {
		int i = 0;
		while(i < array.length){
			if(array[i] % 2 == 0){
				break;
			}
			i++;
		}
		int j = i + 1;
		while(j < array.length){
			if(j >= array.length) break;
			while(j < array.length){
				if(array[j] % 2 != 0){
					break;
				}
				j++;
			}
			if(j == array.length) break;
			int temp = array[j];
			int p = j;
			for(;p > i;p--){
				array[p] = array[p - 1];
			}
			array[p] = temp;
			i++;
			j++;
		}
    }
	
	public static void main(String[] args){
		int[] array = {1, 3, 7, 8, 2, 4, 6, 5, 9, 0};
		reOrderArray(array);
		for(int i : array){
			System.out.println(i);
		}
	}
}
