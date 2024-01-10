package Solved;

public class Solution860 {
	public boolean lemonadeChange(int[] bills) {
		int fives = 0;
		int tens = 0;
		for (int bill : bills){
			if (bill == 5){
				fives += 1;
			}else if (bill == 10){
				tens += 1;
				if (--fives < 0)
					return false;
			}else {
				if (tens > 0){
					tens -= 1;
					if (--fives < 0)
						return false;
				}else {
					fives -= 3;
					if (fives < 0) return false;
				}
			}
		}
		return true;
	}
}
