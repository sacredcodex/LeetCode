package Solved;

public class Solution374{
	class GuessGame {
		private int guess;

		GuessGame(int num){
			guess = num;
		}

		public int guess(int num){
			if (num == guess) return 0;
			return num<guess? 1:-1;
		}
	}
	public int guessNumber(int n){
		GuessGame guessGame = new GuessGame(6);
		int left = 1;
		int right = n;
		while(left<right){
			int guess = (int) (((long)left + right) / 2);
			if (guessGame.guess(guess) == 0)
				return guess;
			else if (guessGame.guess(guess) == 1)
				left = guess + 1;
			else
				right = guess - 1;
		}
		return left;
	}
}
