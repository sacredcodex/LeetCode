package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution1380 {
	public List<Integer> luckyNumbers (int[][] matrix) {
		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < matrix.length; i++) {
			int min = 0;
			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[i][j] < matrix[i][min]) min = j;
			}
			boolean flag = true;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][min] > matrix[i][min]){
					flag = false;
					break;
				}
			}
			if (flag)
				res.add(matrix[i][min]);
		}
		return res;
	}
}
