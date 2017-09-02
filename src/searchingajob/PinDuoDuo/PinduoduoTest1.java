package searchingajob.PinDuoDuo;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PinduoduoTest1 {
	class Bear implements Comparable<Bear>{
		int capacity;
		int hungry;
		
		Bear(int capacity, int hungry){
			this.capacity = capacity;
			this.hungry = hungry;
		}
		
		@Override
		public int compareTo(Bear b) {
			return this.capacity - b.capacity;
		}
	}
	
	public static int specialBinarySearch(int[] array, int k, int start, int end){
		while(start <= end){
			int mid = start + (end - start) / 2;
			if(array[mid] < k){
				start = mid + 1;
			}else if(array[mid] > k){
				end = mid - 1;
			}else{
				return mid;
			}
		}
		return end;
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int bearNum = in.nextInt();
		int sugerNum = in.nextInt();
		int[] sugerEnergy = new int[sugerNum];
		for(int i = 0;i < sugerNum;i++){
			sugerEnergy[i] = in.nextInt();
		}
		Arrays.sort(sugerEnergy);
		PriorityQueue<Bear> heap = new PriorityQueue<>();
		Bear bear;
		while(in.hasNext()){
			int capacity = in.nextInt();
			int hungry = in.nextInt();
			bear = new PinduoduoTest1().new Bear(capacity, hungry);
			heap.add(bear);
		}
		while(!heap.isEmpty()){
			int hungry = heap.poll().hungry;
			while(true){
				int index = specialBinarySearch(sugerEnergy, hungry, 0, sugerNum);
				if(index == -1 || sugerEnergy[index] == 0) break;
				if(hungry >= sugerEnergy[index]){
					hungry -= sugerEnergy[index];
					sugerEnergy[index] = 0;
				}else{
					hungry = 0;
					sugerEnergy[index] -= hungry;
					break;
				}
				Arrays.sort(sugerEnergy);
			}
			System.out.println(hungry);
		}
	}
}
