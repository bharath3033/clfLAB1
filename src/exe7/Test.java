package exe7;

class Test {
	public boolean CheckNumber(int n) {
		boolean flag = false;
		int CurrentDigit = n % 10;
		n /= 10;

		while (n > 0) {
			if (CurrentDigit <= n) {
				flag = true;
				break;
			}
			CurrentDigit = n % 10;
			n /= 10;
		}
		return flag;
	}
}