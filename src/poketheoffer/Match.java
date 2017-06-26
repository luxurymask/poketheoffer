package poketheoffer;

public class Match {
	public boolean match(char[] str, char[] pattern) {
		for(int i = 0, j = 1, k = 0;i < pattern.length;i++,j++){
			char current = pattern[i];
			char next = ((j == pattern.length) ? null : pattern[j]);
			char currentChar = str[k];
			if(next == '*'){
				
			}else if(current == '.' || current == currentChar){
				k++;
				continue;
			}else{
				return false;
			}
		}
		return true;
	}
}
