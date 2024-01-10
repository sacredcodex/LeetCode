package Solved;

import java.util.Arrays;

public class Solution1054 {
	public int[] rearrangeBarcodes(int[] barcodes) {
		Arrays.sort(barcodes);
		int maxNum = 0;
		int maxBarcode = 0;
		int startIndex = 0;
		int num;
		for (int i = 1; i < barcodes.length; i++) {
			if (barcodes[i] != barcodes[i-1]){
				num = i - startIndex;
				if (num > maxNum){
					maxNum = num;
					maxBarcode = startIndex;
				}
				startIndex = i;
			}
		}
		num = barcodes.length - startIndex;
		if (num > maxNum){
			maxNum = num;
			maxBarcode = startIndex;
		}
		int[] res = new int[barcodes.length];
		int index = 0;
		for (int i = 0; i < maxNum; i++) {
			res[index] = barcodes[maxBarcode];
			index += 2;
			if (index >= barcodes.length)
				index = 1;
		}
		for (int i = 0; i < barcodes.length; i++) {
			if (i == maxBarcode)
				i += maxNum;
			if (i >= barcodes.length)
				break;
			res[index] = barcodes[i];
			index += 2;
			if (index >= barcodes.length)
				index = 1;
		}
		return res;
	}
}
