package Solved;

public class Solution1013 {
	public boolean canThreePartsEqualSum(int[] arr) {
		int sum = 0;
		for (int num : arr){
			sum += num;
		}
		if (sum % 3 != 0) return false;
		sum /= 3;
		int count = 0;
		int index1;
		for (index1 = 0; index1 < arr.length; index1++) {
			count += arr[index1];
			if (count == sum)
				break;
		}
		count = 0;
		int index2;
		for (index2 = arr.length - 1; index2 >= 0; index2--) {
			count += arr[index2];
			if (count == sum)
				break;
		}
		return index2 - index1 > 1;
	}
}
