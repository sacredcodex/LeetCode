package Solved;

public class Solution6 {
	/**
	 * 6 将字符串按特定形式输出
	 * 1   9   h
	 * 2  8a  gi
	 * 3 7 b f j
	 * 46  ce  k
	 * 5   d
	 * 19h28agi37bfj46cek5d
	 */
	public String convert(String s, int numRows) {
		if (numRows == 1)
			return s;
		String[] res = new String[numRows];
		for (int j = 0; j < numRows; j++){
			res[j] = "";
		}
		int length = (numRows << 1) - 2;
		int i = 0;
		String sub;
		while (length * i < s.length() - length){
			sub = s.substring(length * i, length * i + length);
			for (int j = 0; j < numRows; j++) {
				res[j] = res[j] + sub.charAt(j);
				if (j > 0 && j < numRows - 1)
					res[j] = res[j] + sub.charAt(length - j);
			}
			i++;
		}
		sub = s.substring(length * i);
		for (int j = 0; j < numRows; j++) {
			if (j < sub.length())
				res[j] = res[j] + sub.charAt(j);
			if (j > 0 && j < numRows - 1)
				if (length - j < sub.length())
					res[j] = res[j] + sub.charAt(length - j);
		}

		String output = "";
		for (int j = 0; j < numRows; j++) {
			output = output + res[j];
		}
		return output;
	}
}
