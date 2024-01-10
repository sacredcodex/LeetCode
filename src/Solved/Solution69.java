package Solved;

import java.util.IllegalFormatWidthException;

public class Solution69 {
	public int mySqrt(int x) {
		if (x < 2) return x;
		int copy = x;
		int sqrt = 1;
		while(copy > 100){
			sqrt *= 10;
			copy /= 100;
		}
		int i;
		for (i = 2; i <= 10; i++) {
			if (i * i > copy)
				break;
		}
		sqrt *= i;
		int delta;
		do {
			delta = x - sqrt * sqrt;
			delta >>= 1;
			delta /= sqrt;
			sqrt += delta;
		}while (delta != 0);
		if ((long)sqrt * sqrt > x)
			return sqrt - 1;
		else return sqrt;
	}
}
