package Solved;

public class Solution1945 {
	public int getLucky(String s, int k) {
		int num = 0;
		for (char c : s.toCharArray()){
			if (c < 'j')
				num += c - 96;
			else if (c > 's')
				num += c - 114;
			else num += c - 105;
		}
		for (int i = 1; i < k; i++) {
			num = operate(num);
		}
		return num;
	}

	private int operate(int num) {
		int res = 0;
		while (num > 0) {
			res += num % 10;
			num /= 10;
		}
		return res;
	}
}
