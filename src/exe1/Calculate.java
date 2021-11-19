package exe1;

class Calculate {
	public int CubeOfDigits(int num) {
		int data, temp, sum = 0;
		temp = num;
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, 3);
			temp /= 10;
		}
		return sum;
	}
}