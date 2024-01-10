package Solved;

public class Solution553 {
	public String optimalDivision(int[] nums) {
		int length = nums.length;
		if (length == 1)
			return String.valueOf(nums[0]);
		if (length == 2)
			return nums[0] + "/" + nums[1];
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(nums[0]);
		stringBuilder.append("/(");
		stringBuilder.append(nums[1]);
		for (int i = 2; i < nums.length; i++) {
			stringBuilder.append('/');
			stringBuilder.append(nums[i]);
		}
		stringBuilder.append(')');
		return stringBuilder.toString();
	}
}
