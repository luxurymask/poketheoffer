package searchingajob.Qunar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class QunarTest2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int p = in.nextInt();
		int r = in.nextInt();
		List<String> pList = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		for(int i = 0;i < r;i++){
			String from = in.next();
			String to = in.next();
			if(!pList.contains(from)) pList.add(from);
			if(!pList.contains(to)) pList.add(to);
			if(map.containsKey(from)){
				map.get(from).add(to);
			}else{
				List<String> list = new ArrayList<>();
				list.add(to);
				map.put(from, list);
			}
			if(map.containsKey(to)){
				map.get(to).add(from);
			}else{
				List<String> list = new ArrayList<>();
				list.add(from);
				map.put(to, list);
			}
		}
		
		int max = 0;
		
		for(int i = 0;i < pList.size();i++){
			for(int j = 0;j < pList.size();j++){
			}
		}
	}
}
