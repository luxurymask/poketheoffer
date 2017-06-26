package poketheoffer.officialsolution;

/**
 * 二维数组中的查找.
 */
public class No1Find {
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
}
