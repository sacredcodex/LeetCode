public class Solution674 {
	public int minMoves(int[] nums, int limit) {
		int[] ops = new int[2 * limit - 1];
		for (int i = 0; i < nums.length / 2; i++) {

		}
		return -1;
	}
	private void op(int[] ops, int a, int b) {
		if (a>b){
			a = a + b;
			b = a - b;
			a = a - b;
		}

	}
}
