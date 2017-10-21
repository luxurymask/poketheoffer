package searchingajob.bytedance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ByteDance2Test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int[] array = new int[n + 1];
		int min = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 1; i <= n; i++) {
			int current = in.nextInt();
			array[i] = current;
			if (min > current) {
				min = current;
				index = i;
			}
		}

		int[] result = Arrays.copyOf(array, n + 1);
		int left;
		if (index <= x) {
			left = x - index;
		} else {
			left = x + n - index;
		}
		int each = array[index];
		result[index] = each * n + left;
		if (index <= x) {
			for (int i = 1; i <= n; i++) {
				if(i == index) continue;
				if (i > index && i <= x) {
					result[i] -= (each + 1);
				} else {
					result[i] -= each;
				}
			}
		} else {
			for (int i = 1; i <= n; i++) {
				if(i == index) continue;
				if (i > x && i <= index) {
					result[i] -= each;
				} else {
					result[i] -= (each + 1);
				}
			}
		}

		for (int i = 1; i < n; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println(result[n]);
	}
}
