package Solved;

public class Solution1342 {
	public int numberOfSteps(int num) {
		int count = 0;
		while (num > 1){
			if ((num & 1) == 1) {
				count += 1;
			}
			num >>= 1;
			count += 1;
		}
		return count + num;
	}
}
