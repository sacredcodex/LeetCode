package Solved;

public class Solution1598 {
	public int minOperations(String[] logs) {
		int count = 0;
		for (String log : logs){
			if (log.equals("./"))
				continue;
			if (log.equals("../"))
				count = Math.max(0, count - 1);
			else count += 1;
		}
		return count;
	}
}
