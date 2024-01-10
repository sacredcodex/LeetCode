package Solved;

public class Solution393 {
	private int head(int data){
		int res = 0;
		while (res <= 7 && (data & (1 << 7)) == (1 << 7)){
			data <<= 1;
			res += 1;
		}
		return res;
	}
	public boolean validUtf8(int[] data) {
		for (int i = 0; i < data.length; i++) {
			data[i] = head(data[i]);
			if (data[i] > 4) return false;
		}
		for (int i = 0; i < data.length; i++) {
			int length = data[i];
			if (length == 0) continue;
			else if (length == 1) return false;
			for (int j = 1; j < length; j++) {
				if (i + j < data.length && data[i + j] == 1)
					continue;
				else return false;
			}
			i += length - 1;
		}
		return true;
	}
}
