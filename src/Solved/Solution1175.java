package Solved;

public class Solution1175 {

	int[] primes = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
	public int numPrimeArrangements(int n) {
		int primeNum = 0;
		for (int prime : primes){
			if (prime <= n)
				primeNum += 1;
			else break;
		}
		int combinedNum = n - primeNum;
		long res = 1;
		for (int i = 2; i <= primeNum; i++) {
			res *= i;
			res %= 1000000007;
		}
		for (int i = 2; i <= combinedNum; i++) {
			res *= i;
			res %= 1000000007;
		}
		return (int) res;
	}
}
