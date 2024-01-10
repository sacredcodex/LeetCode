package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1790 {
	public boolean areAlmostEqual(String s1, String s2) {
		if (s1.length() != s2.length()) return false;
		int length = s1.length();
		List<char[]> dif = new ArrayList<>();
		for (int i = 0; i < length; i++) {
			if (s1.charAt(i) == s2.charAt(i)) {
			}
			else {
				dif.add(new char[]{s1.charAt(i), s2.charAt(i)});
			}
		}
		if (dif.size() == 0)
			return true;
		if (dif.size() == 2)
			return dif.get(0)[0] == dif.get(1)[1] && dif.get(0)[1] == dif.get(1)[0];
		return false;

	}
}
