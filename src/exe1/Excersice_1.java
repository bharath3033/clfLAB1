package exe1;

import java.util.Scanner;

public class Excersice_1 {

	public static void main(String[] args) {
		
		int num;
		Scanner console = new Scanner(System.in);
		System.out.print("Enter the number : ");
        num = console.nextInt();
        Calculate cal = new Calculate();
        System.out.println("Sum of Cube of digits for "+num+" is : "+cal.CubeOfDigits(num));
	}

}