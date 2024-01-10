package Solved;

public class Solution278 {
	/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

	public static class VersionControl {
		private final int bad = 4;
		public boolean isBadVersion(int m){
			return m>=bad;
		}
	}



	public static class Solution extends VersionControl{
		public Solution(){
		}
		public  int firstBadVersion(int n) {
			int a=1, b=n;
			int m=0;
			while(a<b){
				m=a+(b-a)/2;
				if (isBadVersion(m))
					b=m;
				else a=m+1;
			}
			return b;
		}
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.firstBadVersion(5));
	}
}
