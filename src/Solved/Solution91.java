package Solved;

public class Solution91 {
	public int numDecodings(String s) {
		char[] chars = s.toCharArray();
		int[] decodes = new int[chars.length];
		if (chars[0] == '0') return 0;
		else decodes[0] = 1;
		for (int i = 1; i < decodes.length; i++) {
			if (chars[i] == '0')
				if (chars[i-1] == '1' || chars[i-1] == '2')
					if (i == 1)
						decodes[i] = 1;
					else
						decodes[i] = decodes[i-2];
				else return 0;
			else {
				decodes[i] = decodes[i-1];
				if (chars[i-1] == '1' || (chars[i-1] == '2' && chars[i] < '7'))
					if (i == 1)
						decodes[i] += 1;
					else
						decodes[i] += decodes[i-2];
			}
		}
		return decodes[decodes.length-1];
	}
}
