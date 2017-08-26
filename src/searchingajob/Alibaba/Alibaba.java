package searchingajob.Alibaba;

import java.util.Scanner;

/**
 * 天猫国际每天都会卖出很多跨境商品，用户每次下单可能购买多个商品，购买总数小于10件，由于海关规定，每一个进入海关的箱子里面的商品总额不能超过2000元（否则不能清关）所以当用户下单总金额超过2000，必须使用多个箱子分开包装运输；现在为了节约运输成本，希望在满足海关的要求下，能够使用尽可能少的箱子。
 * 注：
 * 每个商品都有自己的单价，有特定的长宽高，所有商品都是长方体
 * 商品可以横放、竖放、侧放，但不用考虑斜放，但是长宽高各项总和必须都要小于等于箱子的长宽高
 * 假定目前天猫国际使用同一种规格的箱子
 * boxLong,boxWidth,boxHigh
 * （箱子长，箱子宽，箱子高）
 *  
 * 某用户下单买了如下商品
 * n（商品件数）
 * item1Price,item1Long,item1With,item1High
 * item2Price,item2Long,item2With,item2High
 * item3Price,item3Long,item3With,item3High
 * item4Price,item4Long,item4With,item4High
 * ...
 * （商品价格，商品长，商品宽，商品高）
 *  (所有输入类型均为int型正整数)
 *  
 * 请你算出需要使用最小的箱子数量，可以将这些商品顺利得清关送到消费者手中，如果无解，输出-1
 *
 */
public class Alibaba {

	static class Model {
		int price;
		int length;
		int width;
		int height;
		
		Model(int price, int length, int width, int height){
			this.price = price;
			this.length = length;
			this.width = width;
			this.height = height;
		}
	}

	private static int process(Model[] items) {
		return -1;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int LIMIT_PRICE = 2000;
		int LIMIT_LENGTH = scanner.nextInt();
		int LIMIT_WIDTH = scanner.nextInt();
		int LIMIT_HEIGHT = scanner.nextInt();
		int itemNum = scanner.nextInt();
		Model[] items = new Model[itemNum];

		while (scanner.hasNext()) {
			items = new Model[itemNum];
			for (int i = 0; i < itemNum; i++) {
				int price = scanner.nextInt();
				int length = scanner.nextInt();
				int width = scanner.nextInt();
				int height = scanner.nextInt();
				Model item = new Model(price, length, width, height);
				items[i] = item;
			}
		}
		System.out.println(process(items));

	}
}
