package searchingajob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class AlibabaOnlineTest {

	/** 请完成下面这个函数，实现题目要求的功能 **/
	/** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^ **/
	static int maxScore(int[] score) {
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		Map<Integer, Integer> scoreIndexMap = new HashMap<Integer, Integer>();
		Set<Integer> shooted = new HashSet<Integer>();
		for(int i = 0;i < score.length;i++){
			int currentScore = score[i];
			heap.offer(currentScore);
			scoreIndexMap.put(currentScore, i);
		}
		PriorityQueue<Integer> specialHeap = new PriorityQueue<>();
		
		int sum = 0;
		while(!heap.isEmpty()){
			int currentScore = heap.poll();
			int index = scoreIndexMap.get(currentScore);
			if(currentScore == 0 || index == 0 || index == score.length - 1){
				specialHeap.offer(currentScore);
				continue;
			}
			int leftIndex = index - 1, rightIndex = index + 1;
			while(leftIndex >= 0 && shooted.contains(score[leftIndex])) leftIndex--;
			while(rightIndex < score.length && shooted.contains(score[rightIndex])) rightIndex++;
			if(leftIndex == -1 || rightIndex == score.length){
				specialHeap.offer(currentScore);
				continue;
			}
			int leftScore = score[leftIndex], rightScore = score[rightIndex];
			if(leftScore == 0 || rightScore == 0){
				specialHeap.offer(currentScore);
				continue;
			}
			sum += leftScore * currentScore * rightScore;
			shooted.add(currentScore);
		}
		
		while(!specialHeap.isEmpty()){
			int currentScore = specialHeap.poll();
			int index = scoreIndexMap.get(currentScore);
			if(currentScore == 0 || index == 0 || index == score.length - 1){
				continue;
			}
			int leftIndex = index - 1, rightIndex = index + 1;
			while(leftIndex >= 0 && shooted.contains(score[leftIndex])) leftIndex--;
			while(rightIndex < score.length && shooted.contains(score[rightIndex])) rightIndex++;
			int leftScore = 1, rightScore = 1;
			if(leftIndex != -1 && score[leftIndex] != 0){
				leftScore = score[leftIndex];
			}
			if(rightIndex != score.length && score[rightIndex] != 0){
				rightScore = score[rightIndex];
			}
			
			sum += leftScore * currentScore * rightScore;
			shooted.add(currentScore);
		}
		
		return sum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		int _score_size = 0;
		_score_size = Integer.parseInt(in.nextLine().trim());
		int[] _score = new int[_score_size];
		int _score_item;
		for (int _score_i = 0; _score_i < _score_size; _score_i++) {
			_score_item = Integer.parseInt(in.nextLine().trim());
			_score[_score_i] = _score_item;
		}

		res = maxScore(_score);
		System.out.println(String.valueOf(res));

	}
}
