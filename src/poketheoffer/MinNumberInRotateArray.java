package poketheoffer;

public class MinNumberInRotateArray {
	/**
	 * faster?
	 * @param array
	 * @return
	 */
	public int minNumberInRotateArray(int [] array) {
		if(array.length == 0) return 0;
		int i = 0, j = array.length - 1;
		while(i < j && array[i] >= array[j]){
			i++;
			j--;
		}
		return Math.min(array[i], array[j + 1]);
	}
	
	/**
	 * basic.
	 * @param array
	 * @return
	 */
	public int minNumberInRotateArrayBasic(int [] array) {
		if(array.length == 0) return 0;
        for(int i = 0;i < array.length;i++){
        	if(i == array.length - 1) break;
        	if(array[i] > array[i + 1]){
        		return array[i + 1];
        	}
        }
		return array[0];
    }
}
