package exe6;

class SquareSum {
	public int calculateDifference(int n) {
		int sum = 0, sumOfSquares = 0, naturalSum = 0;
		int[] squares1 = new int[n + 1];
		int[] naturals = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			squares1[i] = (int) Math.pow(i, 2);
			sumOfSquares += squares1[i];
			naturalSum += i;
		}
		return (naturalSum * naturalSum - sumOfSquares);
	}
}