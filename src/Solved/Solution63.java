package Solved;

public class Solution63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid[0][0] == 1) return 0;
		if (obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1) return  0;
		obstacleGrid[0][0] = -1;
		for (int i = 0; i < obstacleGrid.length; i++) {
			for (int j = 0; j < obstacleGrid[0].length; j++) {
				if (obstacleGrid[i][j] == 0){
					int a = 0, b = 0;
					if (i > 0)
						a = obstacleGrid[i-1][j];
					if (j > 0)
						b = obstacleGrid[i][j-1];
					if (a > 0) obstacleGrid[i][j] += a;
					if (b > 0) obstacleGrid[i][j] += b;
				}else obstacleGrid[i][j] *= -1;
			}
		}
		return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];

	}
}
