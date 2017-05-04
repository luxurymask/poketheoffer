package poketheoffer;

public class FindGreatestSumOfSubArray {
	public static int findGreatestSumOfSubArray(int[] array) {
        if(array.length == 0) return 0;
        int sum = array[0];
        int max = array[0];
        for(int i = 1;i < array.length;i++){
        	sum += array[i];
        	sum = Math.max(sum, array[i]);
        	if(sum > max) max = sum;
        }
        return max;
    }
	
	public static void main(String[] args){
		int[] array = {1,-2,3,10,-4,7,2,-5};
		System.out.println(findGreatestSumOfSubArray(array));
	}
}
