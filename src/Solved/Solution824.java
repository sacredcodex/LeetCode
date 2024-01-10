package Solved;

public class Solution824 {
	public String toGoatLatin(String sentence) {
		String[] words = sentence.split(" ");
		StringBuilder stringBuilder = new StringBuilder();
		int i = 1;
		for (String word : words) {
			char first = word.charAt(0);
			if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U')
				stringBuilder.append(word);
			else {
				stringBuilder.append(word.substring(1));
				stringBuilder.append(first);
			}
			stringBuilder.append("ma");
			for (int j = 0; j < i; j++) {
				stringBuilder.append('a');
			}
			i += 1;
			stringBuilder.append(' ');
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		return stringBuilder.toString();
	}
}
