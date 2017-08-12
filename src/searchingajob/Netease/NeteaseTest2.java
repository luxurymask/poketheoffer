package searchingajob.Netease;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class NeteaseTest2 {
	public static List<Integer> reverse(int[] a){
		List<Integer> list = new LinkedList<Integer>();
		for(int i = 0;i < a.length;i++){
			list.add(a[i]);
			Collections.reverse(list);
		}
		return list;
	}
	
	public static Deque<Integer> reverse1(int[] a){
		Deque<Integer> stack1 = new LinkedList<Integer>();
		Deque<Integer> stack2 = new LinkedList<Integer>();
		
		
		for(int i = 0;i < a.length;i++){
			if(stack1.isEmpty()){
				while(!stack2.isEmpty()){
					stack1.push(stack2.pop());
				}
				stack1.push(a[i]);
			}else{
				while(!stack1.isEmpty()){
					stack2.push(stack1.pop());
				}
				stack2.push(a[i]);
			}
		}
		
		return stack1.isEmpty() ? stack2 : stack1;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n];
        int i = n / 2, j = i - 1;
        for(int k = 0; k < n; k++){
        	int current = sc.nextInt();
        	if(0 == (k & 1)){
        		result[i++] = current;
        	}else{
        		result[j--] = current;
        	}
        }
    	StringBuffer sb = new StringBuffer();
        if(0 == (n & 1)){
        	for(int m = 0;m < n - 1;m++){
        		sb.append(result[m]).append(" ");
        	}
        	sb.append(result[n - 1]);
        }else{
        	for(int m = n - 1;m > 0;m--){
        		sb.append(result[m]).append(" ");
        	}
        	sb.append(result[0]);
        }
        System.out.println(sb.toString());
	}
}
