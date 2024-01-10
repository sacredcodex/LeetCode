package Solved;

import java.util.ArrayList;
import java.util.List;

public class Solution71 {
	public String simplifyPath(String path) {
		String[] words = path.split("/");
		List<String> dirs = new ArrayList<>();
		for (String word : words) {
			if (word.equals("") || word.equals(".")) continue;
			if (word.equals("..")){
				if (!dirs.isEmpty())
					dirs.remove(dirs.size()-1);
			}else
				dirs.add(word);
		}
		StringBuilder stringBuilder = new StringBuilder();
		for (String word : dirs){
			stringBuilder.append('/');
			stringBuilder.append(word);
		}
		if (stringBuilder.length() == 0) return "/";
		else return stringBuilder.toString();
	}
}
