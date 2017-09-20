package searchingajob.airbnb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AirbnbTest1 {
	public static String minimumSubString(String s, String alphabet){
		char[] alphabetArray = alphabet.toCharArray();
		Set<Character> set = new HashSet<>();
		for(int i = 0;i < alphabetArray.length;i++){
			set.add(alphabetArray[i]);
		}
		char[] array = s.toCharArray();
		int left = 0;
		int right = array.length - 1;
		int min = Integer.MAX_VALUE;
		for(int i = 0;i < array.length;i++){
			if(!set.contains(array[i])) continue;
			Set<Character> currentSet = new HashSet<>();
			for(Character c : set){
				currentSet.add(c);
			}
			int j = i;
			for(;j < array.length && !currentSet.isEmpty();j++){
				char c = array[j];
				if(currentSet.contains(c)) currentSet.remove(c);
			}
			if(currentSet.isEmpty() && min > (j - i)){
				min = j - i;
				left = i;
				right = j;
			}
		}
		if(min == Integer.MAX_VALUE) return null;
		StringBuffer sb = new StringBuffer();
		for(int k = left;k < right;k++){
			sb.append(array[k]);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args){
		System.out.println(minimumSubString("zxcvbnm", "as"));
	}
}
