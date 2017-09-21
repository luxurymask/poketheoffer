package searchingajob.ctrip;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CTripTest3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		char[] array = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();
		for(int i = 0;i < array.length;i++){
			char c = array[i];
			if(!set.contains(c)){
				sb.append(c);
				set.add(c);
			}
		}
		System.out.println(sb.toString());
	}
}
