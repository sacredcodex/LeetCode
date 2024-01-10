package Solved;

public class Solution1446 {
	public int maxPower(String s) {
		char[] str = s.toCharArray();
		char last = str[0];
		int power = 0;
		int length = 1;
		for (int i = 1; i < str.length; i++) {
			if (str[i] == last)
				length++;
			else{
				power = Math.max(power,length);
				length = 1;
				last = str[i];
			}
		}
		power = Math.max(power,length);
		return power;
	}
}
