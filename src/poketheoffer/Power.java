package poketheoffer;

public class Power {
	public double power(double base, int exponent) {
		if(exponent == 0) return 1;
        if(exponent % 2 == 0){
        	return power(base, exponent / 2) * power(base, exponent / 2);
        }else{
        	return power(base, exponent / 2) * power(base, exponent / 2) * ((exponent > 0) ? base : 1 / base);
        }
  	}
}
