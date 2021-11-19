package exe7;

import java.util.Scanner;

public class Excersice_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		Test t = new Test();
		if (t.CheckNumber(num) == true) {
			System.out.println("Given " + num + " is an increasing Number");
		} else {
			System.out.println("Given " + num + " is not an increasing Number");
		}

	}

}