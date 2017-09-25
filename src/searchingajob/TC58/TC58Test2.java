package searchingajob.TC58;

public class TC58Test2 {
	public static int getMin(int[] array, int n){
		int left = 0, right = n - 1;
		while(left <= right){
			int mid = left + (right - left) / 2;
			if(mid == 0 || mid == n - 1 || (array[mid - 1] > array[mid] && array[mid + 1] > array[mid])) return array[mid];
			if(array[mid - 1] > array[mid] && array[mid] > array[mid + 1]) left = mid + 1;
			if(array[mid - 1] < array[mid] && array[mid] < array[mid + 1]) right = mid - 1;
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] array = new int[]{6, 4, 2, 1, 3, 7, 9, 20, 45};
		System.out.println(getMin(array, 9));
	}
}
