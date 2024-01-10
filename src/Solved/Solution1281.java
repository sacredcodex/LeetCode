package Solved;

public class Solution1281 {
	public int subtractProductAndSum(int n) {
		int sum = 0;
		int multiplication = 1;
		while (n > 0){
			int digit = n % 10;
			n /= 10;
			sum += digit;
			multiplication *= digit;
		}
		return multiplication - sum;
	}
}
