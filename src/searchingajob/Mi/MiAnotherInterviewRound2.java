package searchingajob.Mi;

/**
 * 大小写字符串将大写字母都挪到小写字母后面，大写字母与大写字母、小写字母与小写字母相对顺序不变。
 */
public class MiAnotherInterviewRound2 {
	/**
	 * O(n2)
	 * @author liuxl
	 * @param s
	 * @return
	 */
	public static String convert(String s){
		char[] array = s.toCharArray();
		boolean flag = true;
		for(int j = array.length - 1;j >= 0;){
			flag = false;
			for(int i = array.length - 1;i >= 0;i--){
				char c = array[i];
				if(c >= 'A' && c <= 'Z') continue;
				while(i >= 1 && array[i - 1] >= 'A' && array[i - 1] <= 'Z'){
					array[i] = array[i - 1];
					i--;
					flag = true;
					j = i;
				}
				array[i] = c;
			}
			if(flag == false) break;
		}
		return String.valueOf(array);
	}
	
	public static void main(String[] args){
		String s = "abcDeFgHIj";
		System.out.println(convert(s));
	}
}
