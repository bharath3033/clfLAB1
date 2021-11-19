package exe8;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test t = new Test();
		System.out.print("Enter the number : ");
		int num;
		num = sc.nextInt();

		if (t.checkNumber(num)) {
			System.out.println(num + " is power of 2");
		} else {
			System.out.println(num + " is not power of 2");
		}
	}
}