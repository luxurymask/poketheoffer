package searchingajob.airbnb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class AirbnbTest2 {
	public static int INFINITE = Integer.MAX_VALUE;

	public static Map<Integer, List<Integer>> shortestPath(int[][] graph, int from, int to) {
		int[] distance = Arrays.copyOf(graph[from],graph[from].length);
		List<List<Integer>> list = new ArrayList<>();
		PriorityQueue<Integer> heap = new PriorityQueue<>(new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return distance[i1] - distance[i2];
			}
		});

		for (int i = 0; i < distance.length; i++) {
			heap.add(i);
			list.add(new ArrayList<>());
		}

		while (!heap.isEmpty()) {
			int current = heap.poll();
			heap.add(current);
			current = heap.poll();
			list.get(current).add(current);
			if (current == to)
				break;

			List<Integer> neighbourList = new ArrayList<>();
			int[] neighbourArray = graph[current];
			for (int i = 0; i < neighbourArray.length; i++) {
				if (neighbourArray[i] != INFINITE && i != current) {
					neighbourList.add(i);
				}
			}

			int newDistance;
			for (int neighbourIndex : neighbourList) {
				if (heap.contains(neighbourIndex) && (newDistance = distance[current] + graph[current][neighbourIndex]) < distance[neighbourIndex]) {
					distance[neighbourIndex] = newDistance;
					List<Integer> neighbour = list.get(neighbourIndex);
					neighbour.clear();
					neighbour.addAll(list.get(current));
				}
			}
		}
		Map<Integer, List<Integer>> resultMap = new HashMap<>();
		List<Integer> path = list.get(to);
		resultMap.put(distance[to], path);
		return resultMap;
	}

	static int[] meet(String[] wizards) {
		int n = wizards.length;
		int[][] graph = new int[n][n];
		for (int i = 0; i < n; i++) {
			String s = wizards[i];
			String[] array = s.split(" ");
			Set<Integer> set = new HashSet<>();
			for(int k = 0;k < array.length;k++){
				set.add(Integer.parseInt(array[k]));
			}
			for (int j = 0, k = 0; j < n; j++) {
				if (set.contains(j)) {
					graph[i][j] = (j - i) * (j - i);
				} else {
					graph[i][j] = INFINITE;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (graph[0][i] != INFINITE)
				graph[0][i] = 0;
		}
		
		int min = INFINITE;
		List<Integer> resultList = new ArrayList<>();
		int minIndex = 0;
		for(int i = 0;i < n;i++){
			if(graph[0][i] != INFINITE){
				Map<Integer, List<Integer>> map = shortestPath(graph, i, 9);
				Map.Entry<Integer, List<Integer>> entry = map.entrySet().iterator().next();
				if(min > entry.getKey()){
					minIndex = i;
					min = entry.getKey();
					resultList = entry.getValue();
				}
			}
		}
		
		int[] result = new int[resultList.size() + 2];
		for(int i = 2;i <= resultList.size() + 1;i++){
			result[i] = resultList.get(i - 2);
		}
		result[0] = 0;
		result[1] = minIndex;
		
		return result;
	}

	public static void main(String[] args) {
		String[] wizarzs = new String[] { "1 2 3", "8 6 4", "7 8 3", "8 1", "6", "8 7", "9 4", "4 6", "1", "1 4" };
		int[] array = meet(wizarzs);
		for (int i = 0;i < array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
