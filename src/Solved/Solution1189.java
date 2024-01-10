package Solved;

public class Solution1189 {
	public int maxNumberOfBalloons(String text) {
		int b = 0;
		int a = 0;
		int l = 0;
		int o = 0;
		int n = 0;
		for (char c : text.toCharArray()){
			if (c == 'b') b += 1;
			else if (c == 'a') a += 1;
			else if (c == 'l') l += 1;
			else if (c == 'o') o += 1;
			else if (c == 'n') n += 1;
		}
		l >>= 1;
		o >>= 1;
		int res = b;
		if (a < res) res = a;
		if (l < res) res = l;
		if (o < res) res = o;
		if (n < res) res = n;
		return res;
	}
}
