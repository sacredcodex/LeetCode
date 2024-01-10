package Solved;

public class Solution415 {
	public static String addStrings(String num1, String num2) {
		int[] n1 = toIntArray(num1);
		int[] n2 = toIntArray(num2);
		int l1 = n1.length;
		int l2 = n2.length;
		int l = Math.max(l1, l2);
		boolean add = false;
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < l; i++) {
			int num = add ? 1 : 0;
			if (i < l1)
				num += n1[i];
			if (i < l2)
				num += n2[i];
			if (num >= 10){
				num -= 10;
				add = true;
			}else
				add = false;
			stringBuilder.append(num);
		}
		if (add)
			stringBuilder.append(1);
		stringBuilder.reverse();
		return stringBuilder.toString();
	}
	private static int[] toIntArray(String str) {
		int[] res = new int[str.length()];
		int index = res.length-1;
		for (char c : str.toCharArray())
			res[index--] = c - '0';
		return res;
	}

	public static void main(String[] args) {
		System.out.println(addStrings("1","9"));
	}
}
