package Solved;

public class Solution1047 {
	public String removeDuplicates(String s) {
		StringBuilder stringBuilder = new StringBuilder(s);
		int index = 0;
		while (index < stringBuilder.length() - 1){
			if (stringBuilder.charAt(index) == stringBuilder.charAt(index + 1)){
				stringBuilder.delete(index, index + 2);
				index = Math.max(0, index - 1);
			}else index += 1;
		}
		return stringBuilder.toString();
	}
}
