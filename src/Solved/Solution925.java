package Solved;

public class Solution925 {
	public static boolean isLongPressedName(String name, String typed) {
		char[] correct = name.toCharArray();
		char[] input = typed.toCharArray();
		int index1 = 0;
		int index2 = 0;
		while(index1 < correct.length && index2 < input.length){
			if (correct[index1] == input[index2]){
				index1 += 1;
				index2 += 1;
			}else if (index2 > 0 && input[index2] == input[index2 - 1]){
				index2 += 1;
			}else return false;
		}
		if (index1 != correct.length) return false;
		while(index2 < input.length){
			if (input[index2] == input[index2 - 1]){
				index2 += 1;
			}else return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isLongPressedName("alex", "aaleex"));
	}
}
