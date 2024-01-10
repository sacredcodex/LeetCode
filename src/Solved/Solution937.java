package Solved;

import java.util.Arrays;
import java.util.Comparator;

public class Solution937 {
	public static String[] reorderLogFiles(String[] logs) {
		Arrays.sort(logs, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String[][] str = new String[2][];
				str[0] = o1.split(" ", 2);
				str[1] = o2.split(" ", 2);
				System.out.println(Arrays.deepToString(str));
				if (str[0][1].charAt(0) < 'A' && str[1][1].charAt(0) < 'A')
					return 0;
				if (str[0][1].charAt(0) < 'A')
					return 1;
				if (str[1][1].charAt(0) < 'A')
					return -1;
				if (str[0][1].equals(str[1][1]))
					return str[0][0].compareTo(str[1][0]);
				return str[0][1].compareTo(str[1][1]);
			}
		});
		return logs;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(reorderLogFiles(new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"})));
	}
}
