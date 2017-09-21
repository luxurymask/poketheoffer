package searchingajob.ctrip;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CTripTest2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Set<Integer> set = new HashSet<>();
		for(int i = 0;i < n;i++){
			set.add(in.nextInt());
		}
		
		for(int i = 1;;i++){
			if(!set.contains(i)){
				System.out.println(i);
				return;
			}
		}
	}
}
