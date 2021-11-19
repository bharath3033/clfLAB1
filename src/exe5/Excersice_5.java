package exe5;

import java.util.Scanner;

public class Excersice_5 {
	public static void main(String[] args) {
		NaturalSum ns = new NaturalSum();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value : ");
		int num = sc.nextInt();
		System.out.println("Sum of " + num + " natural numbers divisible by 3 or 5 is : " + ns.calculateSum(num));
	}

}