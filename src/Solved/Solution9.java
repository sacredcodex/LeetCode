package Solved;

public class Solution9 {
	public static boolean isPalindrome(int x) {
		if (x<0)
			return false;
		int reverse = 0;
		int xCopy = x;
		try {
			while (xCopy > 0) {
				reverse = reverse * 10 + xCopy % 10;
				xCopy /= 10;
				System.out.println(reverse+" "+xCopy);
			}
			System.out.println(reverse+" "+x+" "+xCopy);
			return reverse == x;
		}catch (NumberFormatException e){
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}
}
