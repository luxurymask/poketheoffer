package poketheoffer;

public class ReplaceSpace {
	public static String replaceSpace(StringBuffer str) {
    	String string = str.toString();
    	StringBuilder stringBuilder = new StringBuilder();
    	for(int i = 0;i < string.length();i++){
    		char c = string.charAt(i);
    		if(string.charAt(i) == ' '){
    			stringBuilder.append("%20");
    		}else{
    			stringBuilder.append(c);
    		}
    	}
    	return stringBuilder.toString();
    }
}
