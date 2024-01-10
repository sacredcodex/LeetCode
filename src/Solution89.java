import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution89 {
	public List<Integer> grayCode1(int n) {
		//循环
		List res = new ArrayList();
		res.add(0);
		int head = 1;
		for (int i = 0; i < n; i++) {
			for (int j = res.size() - 1; j >= 0; j -= 1) {
				res.add(head ^ (Integer) res.get(j));
			}
			head <<= 1;
		}
		return res;
	}
	public List<Integer> grayCode(int n) {
		//递归
		if (n == 1){
			List<Integer> res = new ArrayList<>();
			res.add(0);res.add(1);
			return res;
		}
		List gray = grayCode(n-1);
		int add = 1 << (n-1);
		for (int i = gray.size() - 1; i >= 0; i -= 1) {
			gray.add((Integer) gray.get(i) + add);
		}
		return gray;
	}
}
