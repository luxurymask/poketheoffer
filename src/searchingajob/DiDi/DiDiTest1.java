package searchingajob.DiDi;

import java.util.Scanner;

public class DiDiTest1 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = Integer.MIN_VALUE;
        int currentMax = 0;
        int lastMax = 0;
        while (in.hasNextInt()) {//注意while处理多个case
        	int current = in.nextInt();
        	if(lastMax < 0){
        		currentMax = current;
        	}else{
        		currentMax = current + lastMax;
        	}
        	lastMax = currentMax;
        	if(currentMax > result){
        		result = currentMax;
        	}
        }
        System.out.println(result);
    }
}
