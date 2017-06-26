package poketheoffer;

public class ReplaceSpace {
	/**
	 * 利用额外空间。
	 * @param str
	 * @return
	 * 时间复杂度：O(n)
	 * 空间复杂度：O(n)
	 */
	public String replaceSpace(StringBuffer str) {
		String string = str.toString();
    	StringBuffer stringBuffer = new StringBuffer();
    	for(int i = 0;i < string.length();i++){
    		char c = string.charAt(i);
    		if(string.charAt(i) == ' '){
    			stringBuffer.append("%20");
    		}else{
    			stringBuffer.append(c);
    		}
    	}
    	return stringBuffer.toString();
    }
	
	/**
	 * in-space
	 * Java中其实没啥意义。
	 * @param str
	 * @return
	 */
	public static String replaceSpaceInSpace(StringBuffer str){
		for(int i = str.length() - 1;i >= 0;i--){
			char c = str.charAt(i);
			if(c == ' '){
				str.replace(i, i + 1, "%20");
			}
		}
		return str.toString();
	}
	
	public static void main(String[] args){
		StringBuffer str = new StringBuffer("Hello World.");
		System.out.println(replaceSpaceInSpace(str));
	}
}
