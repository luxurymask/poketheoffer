package poketheoffer;

public class GetNumberOfK {
	public int binarySearch(int[] A, int k, int left, int right){
		if(left > right) return -1;
		int m = left + (right - left) / 2; //防止栈溢出。
		if(A[m] == k) return m;
		if(A[m] < k) return binarySearch(A, k, m + 1, right);
		if(A[m] > k) return binarySearch(A, k, left, m - 1);
		return -2;
	}
	
	public int GetNumberOfK(int [] array , int k) {
		int count = 0;
		int i = binarySearch(array, k, 0, array.length - 1);
		if(i == -1){
			return count;
		}else{
			count++;
		}
		for(int j = i + 1;j < array.length && array[j] == k;j++) count++;
		for(int j = i - 1;j >= 0 && array[j] == k;j--) count++;
		return count;
    }
}
