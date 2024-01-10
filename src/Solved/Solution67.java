package Solved;

public class Solution67 {
	public String addBinary(String a, String b) {
		char[] charsA = a.toCharArray();
		char[] charsB = b.toCharArray();
		int length = Math.max(charsA.length, charsB.length) + 1;
		byte[] bytes = new byte[length];
		for (int i = 0; i < charsA.length; i++) {
			if (charsA[charsA.length - 1 - i] == '1')
				bytes[i] += 1;
		}
		for (int i = 0; i < charsB.length; i++) {
			if (charsB[charsB.length - 1 - i] == '1')
				bytes[i] += 1;
		}
		for (int i = 0; i < length-1; i++) {
			if (bytes[i] > 1) {
				bytes[i] -= 2;
				bytes[i + 1] += 1;
			}
		}
		StringBuilder stringBuilder = new StringBuilder();
		if (bytes[length - 1] == 1)
			stringBuilder.append(1);
		for (int i = length - 2; i >= 0; i--) {
			stringBuilder.append(bytes[i]);
		}
		return stringBuilder.toString();
	}
}
