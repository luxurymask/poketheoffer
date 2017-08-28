package searchingajob.Sohu;

import java.util.Scanner;

public class SohuTest2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNextInt()) {
			int[] stocks = new int[7];
			for (int i = 1; i < 7; i++) {
				stocks[i] = in.nextInt();
			}
			int count = stocks[6];
			while(stocks[5]>0) //大小为5*5的只能与1*1的搭配
	        {
	            count++;
	            stocks[5]--;
	            if(stocks[1]>=11) stocks[1]=stocks[1]-11;
	            else if(stocks[1]<11&&stocks[1]>0) stocks[1]=0;
	        }
			while(stocks[4]>0)  
	        {  
	            count++;  
	            stocks[4]--;  
	            if(stocks[2]>0) //4*4只能与2*2,1*1搭配，当2*2的还有时优先与2*2的搭配  
	            {  
	                if(stocks[2]>=5) stocks[2]=stocks[2]-5;  
	                else if(stocks[2]<5)  
	                {  
	                    int remain=20-4*stocks[2];  
	                    stocks[2]=0;  
	                    if(stocks[1]>0) //当2*2不足时与1*1搭配  
	                    {  
	                        if(stocks[1]<remain) stocks[1]=0;  
	                        else stocks[1]=stocks[1]-remain;  
	                    }  
	                }  
	            }  
	            else //当2*2不足时与1*1搭配  
	            {  
	                if(stocks[1]>=20) stocks[1]=stocks[1]-20;  
	                else stocks[1]=0;  
	            }  
	        }  
			while (stocks[3] > 0)
			{
				count++;
				int remain, num;
				if (stocks[3] >= 4) {
					stocks[3] = stocks[3] - 4;
					remain = 0;
					num = 4;
				} else {
					remain = 36 - stocks[3] * 9;
					num = stocks[3];
					stocks[3] = 0;
				}
				if (num == 4)
					continue;
				else if (num == 1) {
					if (stocks[2] >= 5)
					{
						stocks[2] = stocks[2] - 5;
						remain = remain - 20;
						if (remain == stocks[1])
							stocks[1] = 0;
						else
							stocks[1] = stocks[1] - remain;
					}
				} else if (num == 2) {
					if (stocks[2] >= 3) {
						stocks[2] = stocks[2] - 3;
						remain = remain - 12;
						if (remain == stocks[1])
							stocks[1] = 0;
						else
							stocks[1] = stocks[1] - remain;
					}
				} else if (num == 3) {
					if (stocks[2] >= 1) {
						stocks[2] = stocks[2] - 1;
						remain = remain - 4;
						if (remain == stocks[1])
							stocks[1] = 0;
						else
							stocks[1] = stocks[1] - remain;
					}
				}
			}
			while (stocks[2] > 0)
			{
				count++;
				if (stocks[2] >= 9)
					stocks[2] = stocks[2] - 9;
				else {
					int remain = 36 - stocks[2] * 4;
					stocks[2] = 0;
					if (remain > stocks[1])
						stocks[1] = 0;
					else
						stocks[1] = stocks[1] - remain;
				}
			}
			while (stocks[1] > 0) {
				count++;
				if (stocks[1] >= 36)
					stocks[1] = stocks[1] - 36;
				else
					stocks[1] = 0;
			}

			System.out.println(count);
		}
	}
}
