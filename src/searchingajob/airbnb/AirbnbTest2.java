package searchingajob.airbnb;

import java.util.ArrayList;
import java.util.List;

public class AirbnbTest2 {
    public static int start = 0;  
    
    static int[] meet(String[] wizards) {
		int[][] w = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				w[i][j] = Integer.MAX_VALUE;
			}
		}

		for (int i = 0; i < 10; i++) {
			w[i][i] = 0;
			for (int j = 0; j < wizards[i].length(); j += 2) {
				int k = (int) (wizards[i].charAt(j) - '0');
				w[i][k] = (k - i) * (k - i);

			}
		}

		int[] D = new int[10];
		int[][] p = new int[10][10];
		int[] final1 = new int[10];
		int n = 10;
		int v0 = 0;
		int v, w1;

		for (v = 0; v < n; v++)
		{
			final1[v] = 0;
			D[v] = w[v0][v];
			for (w1 = 0; w1 < n; w1++)
				p[v][w1] = 0;
			if (D[v] < Integer.MAX_VALUE) {
				p[v][v0] = 1;
				p[v][v] = 1;
			}
		}
		D[v0] = 0;
		final1[v0] = 0; 
		for (int i = 0; i < n; i++) {
			int min = Integer.MAX_VALUE;
			for (w1 = 0; w1 < n; w1++) {
				if (final1[w1] == 0)
				{
					if (D[w1] < min) {
						v = w1;
						min = D[w1];
					}
				}
			}
			final1[v] = 1;
			for (w1 = 0; w1 < n; w1++)
			{
				if (final1[w1] == 0 && (min + w[v][w1] < D[w1])) {
					D[w1] = min + w[v][w1];
					p[v][w1] = 1; 
				}
			}
		}
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (p[i][j] == 1 && i != j) {
					list.add(j);
					if (j == 9) {
						break;
					}
				}

			}

		}

		int[] ret = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ret[i] = list.get(i);
		}
		return ret;
	}
    
    public static void main(String[] args){
    	String[] wizarzs = new String[]{"1 2 3", "8 6 4","7 8 3","8 1","6","8 7","9 4","4 6","1","1 4"};
    	int[] array = meet(wizarzs);
    	for(int i : array){
        	System.out.println(array[i]);
    	}
    }
}
