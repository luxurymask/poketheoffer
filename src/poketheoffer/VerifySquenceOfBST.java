package poketheoffer;

public class VerifySquenceOfBST {
	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length == 0) return false;
        return VerifySquenceOfBST(sequence, 0, sequence.length - 1);
    }
	
	public static boolean VerifySquenceOfBST(int[] sequence, int start, int end){
		if(start == end || end == 0 || start == sequence.length - 1) return true;
		int root = sequence[end];
		int i = end - 1;
		for(;i >= start;i--){
			if(sequence[i] < root) break;
		}
		
		if(i == start - 1) return true;
		
		for(int j = i;j >= start;j--){
			if(sequence[j] > root) return false;
		}
		
		return VerifySquenceOfBST(sequence, start, i) && VerifySquenceOfBST(sequence, i + 1, end - 1);
	}
	
	public static void main(String[] args){
		int[] sequence = {4,6,7,5};
		System.out.println(VerifySquenceOfBST(sequence));
	}
}
