package poketheoffer;

public class Find {
	public static boolean find(int target, int [][] array) {
		int i = 0;
		int j = array[i].length - 1;
		while(i < array.length && j >= 0){
			int current = array[i][j];
			if(current < target){
				i++;
			}else if(current > target){
				j--;
			}else{
				return true;
			}
		}
		return false;
    }
	
	public static void main(String[] args){
		int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
		System.out.println(find(16, array));
	}
}
