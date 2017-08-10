package poketheoffer;

public class MinNumberInRotateArray {
	
	/**
	 * 使用折半思想。
	 * @param array
	 * @return
	 * O(lgn),极端情况下(111101111)O(n)
	 */
	public static int minNumberInRotateArrayBinarySearch(int[] array){
		if(array.length == 0) return 0;
		int low = 0, high = array.length - 1;
		int mid = low;
		while(array[low] >= array[high]){
			if(low == high - 1){
				mid = high;
				break;
			}
			
			mid = (high - low) / 2 + low;
			if(array[mid] == array[low] && array[mid] == array[high]){
				if(array[low + 1] >= array[low]) low++;
				if(array[high - 1] <= array[high]) high--;
			}else if(array[mid] >= array[low]){
				low = mid;
			}else if(array[mid] <= array[high]){
				high = mid;
			}
		}
		
		return array[mid];
	}
	
	/**
	 * faster?
	 * @param array
	 * @return
	 * O(n),系数为1/2
	 */
	public static int minNumberInRotateArray(int [] array) {
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
	 * O(n),系数为1
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
	
	public static void main(String[] args){
//		int[] array = new int[]{6501,6828,6963,7036,7422,7674,8146,8468,8704,8717,9170,9359,9719,9895,9896,9913,9962,154,293,334,492,1323,1479,1539,1727,1870,1943,2383,2392,2996,3282,3812,3903,4465,4605,4665,4772,4828,5142,5437,5448,5668,5706,5725,6300,6335};
		int[] array = new int[]{1, 0, 1, 1, 1};
//		System.out.println(minNumberInRotateArrayBinarySearch(array));
		System.out.println(minNumberInRotateArray(array));
	}
}
