package Solved;

public class Solution8 {
	public static int myAtoi(String s) {
		try {
			int index = 0;
			while (s.charAt(index) == ' ')
				index++;
			if (s.charAt(index) >= 'a' && s.charAt(index) <= 'z' || s.charAt(index) == '.')
				return 0;
			int index2 = index;
			if (s.charAt(index2) == '-' || s.charAt(index2) == '+')
				index2++;
			while (index2 < s.length()) {
				if (s.charAt(index2) >= '0' && s.charAt(index2) <= '9')
					index2++;
				else break;
			}
			int res;
			try {
				res = Integer.parseInt(s.substring(index, index2));
				return res;
			} catch (Exception e) {
				if (index2 - index == 1)
					return 0;
				if (s.charAt(index) == '-')
					return Integer.MIN_VALUE;
				else return Integer.MAX_VALUE;
			}
		}catch (IndexOutOfBoundsException e){
			return 0;
		}
	}
}
