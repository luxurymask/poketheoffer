package searchingajob.Netease;

/**
 * n对括号，打印所有有效组合。
 */
public class NeteaseInterview1 {
	public static void printBracket(int n){
		printBracket(n, n, "");
	}
	
	public static void printBracket(int left, int right, String s){
		if(left == 0 && right == 0) System.out.println(s);
		if(left > 0) printBracket(left - 1, right, s + "(");
		if(left < right) printBracket(left, right - 1, s + ")");
	}
	
	public static void main(String[] args){
		printBracket(4);
	}
}
