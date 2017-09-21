package searchingajob.Mi;

import java.util.Scanner;

public class MiTest1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int flag = -1;
		boolean point = false;
		while(in.hasNext()){
			String s = in.nextLine();
			char[] array = s.toCharArray();
			StringBuilder sb = new StringBuilder();
			for(int i = 0;i < array.length;i++){
				char c = array[i];
				if(c == '.'){
					sb.append('_');
					if(i != array.length - 1){
						if(array[i + 1] >= 'a' && array[i + 1] <= 'z'){
							flag = 1;
						}else if(array[i + 1] >= 'A' && array[i + 1] <= 'Z'){
							if(i == array.length - 2 || (array[i + 2] >= 'A' && array[i + 2] <= 'Z')){
								flag = 2;
							}else if(array[i + 2] >= 'a' && array[i + 2] <= 'z'){
								point = true;
								flag = 1;
							}else{
								flag = 2;
							}
						}else if(array[i + 1] >= '0' && array[i + 1] <= '9'){
							flag = 3;
						}
					}
				}

				//flag == 1为小写字母
				if(c >= 'a' && c <= 'z'){
					if(flag == 1){
						sb.append(c);
					}else{
						flag = 1;
						sb.append('_');
						sb.append(c);
					}
				}
				
				//flag == 2
				if(c >= 'A' && c <= 'Z'){
					if(flag == 2 || flag == 1){
						if(i == array.length - 1 || (array[i + 1] >= 'A' && array[i + 1] <= 'Z')){
							sb.append(c);
						}else if(array[i + 1] >= 'a' && array[i + 1] <= 'z'){
							if(point == false){
								sb.append('_');
								point = false;
							}
							flag = 1;
							sb.append(c);
						}
					}else{
						sb.append('_');
						flag = 2;
						sb.append(c);
					}
					
					
				}
				
				if(c >= '0' && c <= '9'){
					if(flag == 3){
						sb.append(c);
					}else{
						flag = 3;
						sb.append('_');
						sb.append(c);
					}
				}
			}
			sb.append('_');
			System.out.println(sb.toString());
		}
	}
}
