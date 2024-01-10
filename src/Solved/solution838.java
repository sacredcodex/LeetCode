package Solved;

import java.util.ArrayList;
import java.util.List;

public class solution838 {
	public String pushDominoes(String dominoes) {
		char[] chars = dominoes.toCharArray();
		List<String> list = new ArrayList<>();
		StringBuilder stringBuilder = new StringBuilder();
		for (char c : chars){
			if (c == 'R'){
				if (stringBuilder.length() > 0)
					list.add(stringBuilder.toString());
				stringBuilder.delete(0, stringBuilder.length());
				stringBuilder.append('R');
			}else if (c == 'L'){
				stringBuilder.append('L');
				if (stringBuilder.length() > 0)
					list.add(stringBuilder.toString());
				stringBuilder.delete(0, stringBuilder.length());
			}else stringBuilder.append(c);
		}
		if (stringBuilder.length() > 0)
			list.add(stringBuilder.toString());
		stringBuilder.delete(0, stringBuilder.length());
		for (String str : list){
			int length = str.length();
			if (str.charAt(0) == 'R' && str.charAt(length-1) == 'L'){
				int half = length >> 1;
				stringBuilder.append("R".repeat(half));
				if ((length & 1) == 1)
					stringBuilder.append('.');
				stringBuilder.append("L".repeat(half));
			}else if (str.charAt(0) == 'R'){
				stringBuilder.append("R".repeat(length));
			}else if (str.charAt(length-1) == 'L'){
				stringBuilder.append("L".repeat(length));
			}else stringBuilder.append(str);
		}
		return stringBuilder.toString();
	}
}
