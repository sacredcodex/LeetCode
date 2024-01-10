package Solved;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Solution929 {
	public int numUniqueEmails(String[] emails) {
		HashMap<String, HashSet<String>> hashMap = new HashMap<>();
		for (String email : emails){
			String[] address = email.split("@");
			int plus = address[0].indexOf('+');
			if (plus != -1){
				address[0] = address[0].substring(0, plus);
			}
			address[0] = address[0].replace(".", "");
			System.out.println(address[0]);
			if (hashMap.containsKey(address[1]))
				hashMap.get(address[1]).add(address[0]);
			else {
				HashSet<String> hashSet = new HashSet<>();
				hashSet.add(address[0]);
				hashMap.put(address[1], hashSet);
			}
		}
		int count = 0;
		for (HashSet<String> set : hashMap.values()){
			count += set.size();
		}
		return count;
	}
}
