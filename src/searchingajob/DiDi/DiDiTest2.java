package searchingajob.DiDi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiDiTest2 {
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			list.add(in.nextInt());
		}
		int size = list.size();
		int k = list.get(size - 1);
		list.remove(size - 1);
		System.out.println(quickSort(size - k, list, 0, size - 2));
	}
	
	public static int quickSort(int k, List<Integer> list, int start, int end) {

        int pivot = list.get(end);

        int left = start;
        int right = end;

        while (true) {

            while (list.get(left) < pivot && left < right) {
                left++;
            }

            while (list.get(right) >= pivot && right > left) {
                right--;
            }

            if (left == right) {
                break;
            }

            swap(list, left, right);
        }

        swap(list, left, end);

        if (k == left + 1) {
            return pivot;
        } else if (k < left + 1) {
            return quickSort(k, list, start, left - 1);
        } else {
            return quickSort(k, list, left + 1, end);
        }
    }

    public static void swap(List<Integer> list, int n1, int n2) {
        int tmp = list.get(n1);
        list.set(n1, list.get(n2));
        list.set(n2, tmp);
    }
}
