package Solved;

import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Math.min;

public class Solution279 {
	private final static int[] squares = {1,4,9,16,25,36,49,64,81,100,
			121,144,169,196,225,256,289,324,361,400,
			441,484,529,576,625,676,729,784,841,900,
			961,1024,1089,1156,1225,1296,1369,1444,1521,1600,
			1681,1764,1849,1936,2025,2116,2209,2304,2401,2500,
			2601,2704,2809,2916,3025,3136,3249,3364,3481,3600,
			3721,3844,3969,4096,4225,4356,4489,4624,4761,4900,
			5041,5184,5329,5476,5625,5776,5929,6084,6241,6400,
			6561,6724,6889,7056,7225,7396,7569,7744,7921,8100,
			8281,8464,8649,8836,9025,9216,9409,9604,9801,10000};
	public int numSquares1(int n) {
		boolean isTwo = false;
		for (int square1 : squares){
			if (n == square1) return 1;
			if (!isTwo)
			for (int square2 : squares) {
				if (n == square1 + square2) {
					isTwo = true;
					break;
				}
			}
		}
		if (isTwo) return 2;
		while((n & 3) == 0){
			n >>= 2;
		}
		if ((n & 7) == 7) return 4;
		return 3;
	}

	HashMap<Integer,Integer> numToSqu = new HashMap<>();
	public int numSquares(int n) {
		if (numToSqu.containsKey(n)) return numToSqu.get(n);
		int idx = Arrays.binarySearch(squares, n);
		if (idx >= 0) {
			numToSqu.put(n, 1);
			return 1;
		}
		idx = -idx -2;
		int res = Integer.MAX_VALUE;
		while(idx >= 0){
			res = min(res, numSquares((n-squares[idx]))+1);
			idx -= 1;
		}
		numToSqu.put(n,res);
		return res;
	}
}
