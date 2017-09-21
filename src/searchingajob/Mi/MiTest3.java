package searchingajob.Mi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MiTest3 {
	private static List<String> list = new ArrayList<>();
	
	public static void get(String result, String input){
		if(input.equals("")){
			list.add(result);
			return;
		}
		
		if(input.length() == 1){
			list.add(result + (char)('a' + Integer.parseInt(input) - 1));
			return;
		}
		
		if(input.length() >= 2){
			get(result + (char)('a' + Integer.parseInt(input.substring(0, 1)) - 1), input.substring(1));
			int num = Integer.parseInt(input.substring(0, 2));
			if(num >= 1 && num <= 26){
				get(result + (char)('a' + num - 1), input.substring(2));
			}
		}
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String line = in.nextLine();
			get("", line);
			Collections.sort(list);
			for(int i = 0;i < list.size() - 1;i++){
				System.out.print(list.get(i) + " ");
			}
			System.out.println(list.get(list.size() - 1));
			list.clear();
		}
	}
}
