package searchingajob.Alibaba;

import java.util.Arrays;
import java.util.Scanner;

public class SimulationTest {
	static int pick(int[] peaches) {
		int[] copy = peaches.clone();
		Arrays.sort(copy);
		int length = peaches.length;
		int[][] c = new int[length + 1][length + 1];
		for(int i = 0;i <= length;i++){
			c[i][0] = 0;
		}
		for(int j = 0;j <= length;j++){
			c[0][j] = 0;
		}
		for(int i = 1;i <= length;i++){
			for(int j = 1;j <= length;j++){
				int i1 = peaches[i - 1];
				int i2 = copy[j - 1];
				if(i1 == i2){
					c[i][j] = c[i - 1][j - 1] + 1;
				}else{
					c[i][j] = Math.max(c[i - 1][j], c[i][j - 1]);
				}
			}
		}
		return c[length][length];
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        int[] peaches = new int[trees];
        for (int i = 0; i < peaches.length; i++) {
            peaches[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(pick(peaches));
    }
    
	/*
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        List<List<Integer>> subsequenceList = new ArrayList<List<Integer>>();
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < trees; i++) {
        	int current = Integer.parseInt(in.nextLine().trim());
        	if(current < min){
        		List<Integer> newList = new ArrayList<Integer>();
        		newList.add(current);
        		min = current;
        		subsequenceList.add(newList);
        		continue;
        	}
        	for(List<Integer> list : subsequenceList){
        		int last = list.get(list.size() - 1);
        		if(last <= current){
        			list.add(current);
        			if(list.size() > max){
        				max = list.size();
        			}
        		}
        	}
        }
        System.out.println(max);
	}
	*/
}
