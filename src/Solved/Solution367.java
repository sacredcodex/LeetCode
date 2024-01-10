package Solved;

public class Solution367 {
	public boolean isPerfectSquare(int num) {
		for (long i = 2; i * i <= num;) {
			if (num % i == 0){
				num /= i;
				if (num % i == 0){
					num /= i;
				}else return false;
			}else {
				i += 1;
			}
		}
		return num == 1;
	}
}
