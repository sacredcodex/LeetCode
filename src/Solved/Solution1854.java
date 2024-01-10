package Solved;

public class Solution1854 {
	public int maximumPopulation(int[][] logs) {
		int[] changes = new int[101];
		for (int[] log : logs){
			changes[log[0]-1950] += 1;
			changes[log[1]-1950] -= 1;
		}
		int population = 0;
		int maxPopulation = 0;
		int maxIndex = 0;
		for (int i = 0; i < changes.length; i++) {
			population += changes[i];
			if (population > maxPopulation){
				maxPopulation = population;
				maxIndex = i;
			}
		}
		return 1950 + maxIndex;
	}
}
