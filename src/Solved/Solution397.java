package Solved;

public class Solution397 {
	public int integerReplacement(int n) {
		long temp = n;
		int step = 0;
		while(temp!=1){
			/*
			2）取一个数的指定位
			比如取数 X=1010 1110 的低4位，只需要另找一个数Y，令Y的低4位为1，其余位为0，即Y=0000 1111，然后将X与Y进行按位与运算（X&Y=0000 1110）即可得到X的指定位。
			https://www.runoob.com/w3cnote/bit-operation.html
			 */
			if( (temp & 3) == 3 && temp != 3){
				temp++;
			}
			else if( (temp&1) == 1){
				temp--;
			}
			else{
				temp=temp>>1;
			}
			step++;
		}
		return step;
	}
}
