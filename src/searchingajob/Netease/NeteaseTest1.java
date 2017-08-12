package searchingajob.Netease;

import java.util.Scanner;

public class NeteaseTest1 {
	public static int getLength(String s){
		int max = 0;
		int[] array = new int[s.length()];
		array[0] = 1;
		for(int i = 1;i < s.length();i++){
			if(s.charAt(i) != s.charAt(i - 1)){
				array[i] = array[i - 1] + 1;
			}else{
				array[i] = 1;
			}
			if(array[i] > max) max = array[i];
		}
		return max;
	}
	
	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(getLength(s));
	}
}
