package Offer;

public class Offer45 {
	private int[] order = {100,10,1,11,12,13,14,15,16,17,18,19,20,21,2,22,23,24,25,26,27,28,29,30,31,32,3,33,34,35,36,37
			,38,39,40,41,42,43,4,44,45,46,47,48,49,50,51,52,53,54,5,55,56,57,58,59,60,61,62,63,64,65,6,66,67,68,69,70,71
			,72,73,74,75,76,7,77,78,79,80,81,82,83,84,85,86,87,8,88,89,90,91,92,93,94,95,96,97,98,9,99};
	public String minNumber(int[] nums) {
		int[] count = new int[101];
		for (int num : nums){
			count[num] += 1;
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (int i : order)
			for (int j = 0; j < count[i]; j++) {
				stringBuilder.append(i);
			}
		return stringBuilder.toString();
	}
}
