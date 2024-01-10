package Solved;

public class Solution1784 {
	public boolean checkOnesSegment(String s) {
		String[] strings = s.split("0");
		int count = 0;
		for (String str : strings){
			if (str.length() > 0)
				count += 1;
		}
		return count < 2;
	}
}
