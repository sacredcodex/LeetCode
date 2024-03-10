package Solved;

import java.util.HashMap;

public class Solution1396 {
    class UndergroundSystem {
        HashMap<Integer,Integer> idToTime;
        HashMap<Integer, String> idToStation;
        HashMap<String, Integer> routeToTime;
        HashMap<String, Integer> routeCount;

        public UndergroundSystem() {
            idToTime = new HashMap<>();
            idToStation = new HashMap<>();
            routeToTime = new HashMap<>();
            routeCount = new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            idToStation.put(id, stationName);
            idToTime.put(id, t);
        }

        public void checkOut(int id, String stationName, int t) {
            StringBuilder sb = new StringBuilder();
            sb.append(idToStation.get(id));
            sb.append("->");
            sb.append(stationName);
            String str = sb.toString();
            routeToTime.put(str, routeToTime.getOrDefault(str,0)+t-idToTime.get(id));
            routeCount.put(str,routeCount.getOrDefault(str,0)+1);
        }

        public double getAverageTime(String startStation, String endStation) {
            StringBuilder sb = new StringBuilder();
            sb.append(startStation);
            sb.append("->");
            sb.append(endStation);
            String str = sb.toString();
            return (double) routeToTime.get(str) / routeCount.get(str);
        }
    }

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
}
