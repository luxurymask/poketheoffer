package poketheoffer;

import java.util.ArrayList;

public class PrintMatrix {
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0;i <= Math.min((matrix.length - 1) / 2, (matrix[0].length - 1) / 2);i++){
			printMatrix(matrix, i, list);
		}
		return list;
    }
	
	public static void printMatrix(int[][] matrix, int index, ArrayList<Integer> list){
		int i = index, j = index;
		int lengthI = matrix.length;
		int lengthJ = matrix[0].length;
		while(j <= lengthJ - 1 - index){
			list.add(matrix[i][j]);
			j++;
		}
		j--;
		i++;
		if(i > lengthI - 1 - index) return;
		while(i <= lengthI - 1 - index){
			list.add(matrix[i][j]);
			i++;
		}
		i--;
		j--;
		if(j < index) return;
		while(j >= index){
			list.add(matrix[i][j]);
			j--;
		}
		j++;
		i--;
		while(i > index){
			list.add(matrix[i][j]);
			i--;
		}
	}
	
	public static void main(String[] args){
		int[][] array = {{1}, {2}, {3}, {4}, {5}};
		int[][] array2 = {{1, 2, 3, 4, 5}};
		ArrayList<Integer> list = printMatrix(array2);
		for(int i : list){
			System.out.println(i);
		}
	}
}
