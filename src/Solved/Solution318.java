package Solved;

public class Solution318 {
	public int maxProduct(String[] words) {
		int maxProduct = 0;
		for (int i = 0; i < words.length; i++) {

			for (int j = i+1; j < words.length; j++) {
				boolean ok = true;
				for (int k = 0; k < 26; k++) {
					char c = (char) ('a'+k);
					if (words[i].indexOf(c) == -1)
						continue;
					else if (words[j].indexOf(c) == -1)
						continue;
					else ok = false;
					break;
				}
				if (ok)
					maxProduct = Math.max(maxProduct, words[i].length()*words[j].length());
			}
		}
		return maxProduct;
	}
}
