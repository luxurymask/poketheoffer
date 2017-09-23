package searchingajob.CM;

import java.util.Scanner;

/**
 * Unix时间戳转换
 */
public class CMTest1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		long timestamp = Long.parseLong(s);
		long years = timestamp / 311040001l;
		years = years + 1970;
		long left = timestamp % 311040001l;
		long months = left / 2592000 + 1;
		left = left % 2592000;
		long days = left / 86400 + 1;
		left = left % 86400;
		long hours = left / 3600;
		left = left % 3600;
		long minutes = left / 60;
		long seconds = left % 60;
		StringBuffer sb = new StringBuffer();
		sb.append(years).append("/").append((months > 9) ? months : ("0" + months)).append("/")
				.append((days > 9) ? days : ("0" + days)).append(" ").append((hours > 9) ? hours : ("0" + hours))
				.append(":").append((minutes > 9) ? minutes : ("0" + minutes)).append(":")
				.append((seconds > 9) ? seconds : ("0" + seconds));
		System.out.println(sb.toString());
	}
}
