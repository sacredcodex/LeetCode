package Solved;

import java.util.HashMap;

public class Solution359 {
	class Logger {

		HashMap<String, Integer> hashMap;

		public Logger() {
			hashMap = new HashMap<>();
		}

		public boolean shouldPrintMessage(int timestamp, String message) {
			if (hashMap.containsKey(message)){
				if (hashMap.get(message) + 10 <= timestamp){
					hashMap.put(message, timestamp);
					return true;
				}else return false;
			}else {
				hashMap.put(message, timestamp);
				return true;
			}
		}
	}
}
