package poketheoffer;

public class NumberOf1 {
	/**
	 * @author strongbuffer
	 * @param n
	 * @return
	 */
    public static int numberOf1(int n) {
		int count = 0;
		
		for(int i = 0 ;n!=0&&i<32;i++){
            count += 1&n;
            n=n>>1;
        }
        return count;
    }
	
	public static int numberOf1BitCount(int n){
		return Integer.bitCount(n);
	}
	
	public static int numberOf1Shift(int n) {
		int i = 1, count = 0;
		while(n != 0 && i++ <= 32){
			count += (n & 1);
			n >>= 1;
		}
		return count;
    }
	
	public static void main(String[] args){
		System.out.println(numberOf1(-256));
	}
}
