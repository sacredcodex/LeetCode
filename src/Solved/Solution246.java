package Solved;

import java.util.HashMap;

public class Solution246 {
	public boolean isStrobogrammatic(String num) {
		char[] chars = num.toCharArray();
		HashMap<Character, Character> map = new HashMap<>();
		map.put('0','0');
		map.put('1','1');
		map.put('6','9');
		map.put('8','8');
		map.put('9','6');
		int index1 = 0, index2 = chars.length - 1;
		while (index1 <= index2){
			if (map.getOrDefault(chars[index1++], 'a') != chars[index2--])
				return false;
		}
		return true;
	}
}
