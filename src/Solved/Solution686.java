package Solved;

public class Solution686 {
	public int repeatedStringMatch(String a, String b) {
		int res = 0;
		int index = b.indexOf(a);
		if (index == -1){
			if (a.contains(b)) return 1;
			if ((a+a).contains(b)) return 2;
			return -1;
		}
		String head = b.substring(0,index);
		if (!a.contains(head)) return -1;
		else if (!head.isEmpty()) res += 1;
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(b.substring(index));
		while (true) {
			int indexOfA = stringBuilder.indexOf(a);
			if (indexOfA == 0) {
				stringBuilder.delete(0, a.length());
				res += 1;
			}else if (indexOfA > 0) return -1;
			else break;
		}
		if (stringBuilder.isEmpty()) return res;
		if (a.indexOf(stringBuilder.toString()) == 0) res += 1;
		else return -1;
		return res;

	}
}
