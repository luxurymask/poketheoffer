package searchingajob.ctrip;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CTripTest1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		Set<Integer> set = new HashSet<>();
		List<Integer> list1 = new ArrayList<>();
		for(int i = 0;i < m;i++){
			int num = in.nextInt();
			list1.add(num);
			set.add(num);
		}
		int n = in.nextInt();
		List<Integer> list2 = new ArrayList<>();
		for(int i = 0;i < n;i++){
			int num = in.nextInt();
			if(!set.contains(num)) list2.add(num);
		}
		
		n = list2.size();
		
		System.out.println(middleNumberOfTwoArr(list1, list2));
	}
	
	public static int middleNumberOfTwoArr(List<Integer> list1,List<Integer> list2){  
		
        int start1= 0;  
        int start2= 0;  
        int end1 = list1.size()-1;  
        int end2 = list2.size()-1;  
          
        int midIndex1;  
        int midIndex2;  
  
        while(start1<end1 || start2<end2){  
            midIndex1 = (start1 + end1)/2;   
            midIndex2 = (start2 + end2)/2;   
            if(list1.get(midIndex1) == list2.get(midIndex2)){  
                return list1.get(midIndex1);  
            }  
              
            if (list1.get(midIndex1) < list2.get(midIndex2)){  
                if(((end1-start1)%2 == 0) && ((end2-start2)%2==0)){  
                    start1 = midIndex1;  
                    end2 = midIndex2;  
                }else {  
                    start1 = midIndex1+1;  
                    end2 = midIndex2;  
                }  
            }else {  
                if(((end1-start1)%2 == 0) && ((end2-start2)%2==0)){  
                    start2 = midIndex2;  
                    end1 = midIndex1;  
                }else {  
                    start2 = midIndex2+1;  
                    end1 = midIndex1;  
                }  
            }  
        }  
        return (list1.get(start1)<list2.get(start2)? list1.get(start1):list2.get(start2));  
    }  
}
