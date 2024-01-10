public class Solution10 {
	public boolean isMatch(String s, String p) {
		int index = 0;
		for (int i = 0; i < p.length(); i++) {
			try{
				if (p.charAt(i+1)=='*')
					i = i+2;
			}catch(IndexOutOfBoundsException e){
			}
			if (p.charAt(i) == '.')
				index++;
			else
				index = s.substring(index).indexOf(p.charAt(i));
			if (index == -1 || index > s.length())//p with '.'ending
				return false;
		}
		return true;
	}
}
