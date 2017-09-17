package searchingajob.sina;

/**
 * 给定正序排列数组A和B，将两数组倒序后合并进A。
 * @author liuxl
 */
public class SinaTest1 {
	public static int[] merge(int[] A, int[] B, int m, int n){
		for(int i = 0;i < m / 2;i++){
			int temp = A[i];
			A[i] = A[m - i - 1];
			A[m - i - 1] = temp;;
		}
		
		for(int i = n - 1;i >= 0;i--){
			int j = n - i + m - 2;
			for(;j >= 0 && A[j] < B[i];j--){
				A[j + 1] = A[j];
			}
			A[j + 1] = B[i];
		}
		
		return A;
	}
	
	public static void main(String[] args){
		int[] array1 = new int[9];
		array1[0] = 1;
		array1[1] = 3;
		array1[2] = 7;
		array1[3] = 8;
		int[] array2 = {2, 4, 5, 6, 9};
		int[] result = merge(array1, array2, 4, 5);
		for(int i = 0;i < result.length;i++){
			System.out.print(result[i] + " ");
		}
	}
}
