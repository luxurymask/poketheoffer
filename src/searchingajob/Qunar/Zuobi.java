package searchingajob.Qunar;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zuobi {

	public static String r = "";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int r = in.nextInt();

		Map<String, Integer> map = new HashMap<>();

		int[][] array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j)
					array[i][j] = Integer.MAX_VALUE;
			}
		}

		for (int i = 0; i < r; i++) {
			String from = in.next();
			String to = in.next();
			if (!map.containsKey(from))
				map.put(from, map.size());
			if (!map.containsKey(to))
				map.put(to, map.size());
			array[map.get(from)][map.get(to)] = 1;
			array[map.get(to)][map.get(from)] = 1;
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (array[i][k] < Integer.MAX_VALUE && array[k][j] < Integer.MAX_VALUE
							&& array[i][j] > array[i][k] + array[k][j]) {
						array[i][j] = array[i][k] + array[k][j];
					}
				}
			}
		}

		boolean flag = false;
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (array[i][j] == Integer.MAX_VALUE) {
					flag = true;
					break;
				} else if (array[i][j] > max) {
						max = array[i][j];
				}
			}
		}
		
		if (flag) System.out.println("DISCONNECTED");
		else System.out.println(max);
	}

}