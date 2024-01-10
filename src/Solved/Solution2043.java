package Solved;

public class Solution2043 {
	class Bank {

		long[] balance;
		int n;

		private boolean check(int account){
			return account > 0 && account <= n;
		}

		public Bank(long[] balance) {
			this.balance = balance;
			n = balance.length;
		}

		public boolean transfer(int account1, int account2, long money) {
			if (check(account1) && check(account2)) {
				if (withdraw(account1, money)) {
					if (deposit(account2, money))
						return true;
					else {
						return deposit(account1, money);
					}
				} else return false;
			}else return false;
		}

		public boolean deposit(int account, long money) {
			if (check(account)){
				balance[account - 1] += money;
				return true;
			}else return false;
		}

		public boolean withdraw(int account, long money) {
			if (check(account) && balance[account-1] >= money){
				balance[account-1] -= money;
				return true;
			}else return false;
		}
	}
}
