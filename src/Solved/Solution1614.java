package Solved;

public class Solution1614 {
	public int maxDepth(String s) {
		int depth = 0;
		int mDepth = 0;
		for (char c : s.toCharArray()) {
			if (c == '(') {
				depth += 1;
				if (depth > mDepth)
					mDepth = depth;
			}else if (c == ')')
				depth -= 1;
		}
		return mDepth;
	}
}
