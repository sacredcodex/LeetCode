package Solved;

public class Solution66 {
	public int[] plusOne(int[] digits) {
		boolean allNine = true;
		for (int digit : digits){
			if (digit != 9){
				allNine = false;
				break;
			}
		}
		if (allNine){
			int[] res = new int[digits.length+1];
			res[0] = 1;
			return res;
		}else {
			boolean add = true;
			for (int i = digits.length-1; i >= 0; i--) {
				if (add){
					digits[i] += 1;
				}
				if (digits[i] == 10){
					digits[i] = 0;
					add = true;
				}else {
					add = false;
				}
			}
		}
		return digits;
	}
}
