package Solved;

public class Solution125 {
	public static boolean isPalindrome(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c>='a' && c<='z')
				stringBuilder.append(c);
			if (c>='A' && c<='Z')
				stringBuilder.append((char)(c + 32));
			if (c>='0' && c<='9')
				stringBuilder.append(c);
		}
		return isPalindrome1(stringBuilder.toString());
	}
	public static boolean isPalindrome1(String s) {
		int index1 = 0;
		int index2 = s.length()-1;
		while (index2 - index1 >= 1){
			if (s.charAt(index1) != s.charAt(index2))
				return false;
			index1++;
			index2--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("OP"));
	}
}
