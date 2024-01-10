import java.util.Arrays;

public class Solution1218 {
	public int longestSubsequence(int[] arr, int difference) {
		int[] indexRecord = new int[arr.length];
		Arrays.fill(indexRecord, -1);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] - arr[i] == difference) {
					indexRecord[i] = j;
					break;
				}
			}
		}

		int[] length = new int[indexRecord.length];
		boolean[] calculate = new boolean[indexRecord.length];
		for (int i = 0; i < length.length; i++) {
			length[i] = 1;
			calculate[i] = false;
		}

		int number = 1;
		for (int i = 0; i < length.length; i++) {
			if (!calculate[i])
				number = Math.max(solve(length, calculate, indexRecord, i), number);
		}

		return number;
	}

	private int solve(int[] length, boolean[] calculate, int[] indexRecord, int i){
		if (calculate[i]){
			return length[i];
		}else {
			if (indexRecord[i] == -1){
				length[i] = 1;
				calculate[i] = true;
			}else {
				length[i] = 1 + solve(length, calculate, indexRecord, indexRecord[i]);
				calculate[i] = true;
			}
		}
		return length[i];
	}

}
