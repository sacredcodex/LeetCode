package Solved;

public class Solution744 {
	public char nextGreatestLetter(char[] letters, char target) {
		for (char c : letters)
			if (c > target)
				return c;
		return letters[0];
	}
}
