package searchingajob.miaozhen;

import java.util.Deque;
import java.util.LinkedList;

public class MiaozhenInterview {
	public static String convert(String infix) {
		StringBuffer sb = new StringBuffer();
		char[] array = infix.toCharArray();
		Deque<Character> stack = new LinkedList<>();
		for (int i = 0; i < array.length; i++) {
			char c = array[i];
			if (c == ' ')
				continue;
			if (c >= 'a' && c <= 'z') {
				sb.append(c);
				continue;
			}
			if (c == ')') {
				char current = stack.pop();
				while (!stack.isEmpty() && current != '(') {
					sb.append(current);
					current = stack.pop();
				}
				continue;
			}
			while (!stack.isEmpty() && !higher(c, stack.getFirst())) {
				if (stack.getFirst() == '(')
					break;
				sb.append(stack.pop());
			}
			stack.push(c);
		}
		
		while(!stack.isEmpty()) sb.append(stack.pop());
		return sb.toString();
	}

	public static boolean higher(char c1, char c2) {
		if (c1 == '(')
			return c2 != '(';
		if (c1 == '*' || c1 == '/')
			return (c2 == '+' || c2 == '-');
		return false;
	}

	public static void main(String[] args) {
		String s = "a + b*c + (d * e + f) * g";
		System.out.println(convert(s));
	}
}
