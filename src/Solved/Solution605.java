package Solved;

public class Solution605 {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int count = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 1 && i > 0 && flowerbed[i-1] == 1)
				count -= 1;
			if (flowerbed[i] == 0){
				if (i > 0 && flowerbed[i-1] == 0 || i == 0){
					count += 1;
					flowerbed[i] = 1;
				}
			}
		}
		return count >= n;
	}
}
