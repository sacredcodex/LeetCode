package Solved;

public class Solution168 {
	public String convertToTitle(int columnNumber) {
		StringBuilder stringBuilder = new StringBuilder();
		while(columnNumber > 26){
			columnNumber -= 1;
			stringBuilder.append( (char) (columnNumber % 26 + 'A') );
			columnNumber /= 26;
		}
		return stringBuilder.reverse().toString();
	}
}
