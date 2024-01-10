package Solved;

public class Solution941 {
	public boolean validMountainArray(int[] arr) {
		if (arr.length < 3) return false;
		if (arr[0] >= arr[1] || arr[arr.length-1] >= arr[arr.length-2]) return false;
		int index = 2;
		while(arr[index-1] < arr[index++]){
		}
		index -= 1;
		while (index < arr.length - 1){
			if (arr[index - 1] <= arr[index++])
				return false;
		}
		return true;
	}
}
