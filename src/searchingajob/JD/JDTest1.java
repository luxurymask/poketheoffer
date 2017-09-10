package searchingajob.JD;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class JDTest1 {
	public static int result = 1;
	
	public static int count(String s, int start, int end){
		char[] array = s.toCharArray();
		int left = 0, right = 0;
		for(int i = start;i < end;i++){
			if(array[i] == '('){
				left++;
			}else{
				right++;
			}
			if(left == right){
				if(left == 1){
					return 1;
				}
				result *= count(s, start, i);
			}
		}
		return result;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(count(s, 0, s.length()));
	}
}
