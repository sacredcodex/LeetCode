package Solved;

public class Solution1103 {
	public int[] distributeCandies(int candies, int num_people) {
		int[] res =new int[num_people];
		int time = 0;
		while (candies > time){
			res[time % num_people] += time + 1;
			candies -= time + 1;
			time++;
		}
		res[time % num_people] += candies;
		return res;
	}
}
