package exe6;

import java.util.Scanner;

public class Excersice_6 {
	public static void main(String[] args) {
		SquareSum sq = new SquareSum();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int num = sc.nextInt();
		System.out.println("Difference in sum of Squares and sum of natural squares : " + sq.calculateDifference(num));
	}

}