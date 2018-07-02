
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) throws OutOfRangeException {

		int input1 = 0, input2 = 0, greatestCommonDivisor = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please type in a number: ");
		input1 = scan.nextInt();

		System.out.println("Please type in another number: ");
		input2 = scan.nextInt();

		while (input1 != input2) {

			if (input1 > input2) {
				input1 -= input2;
			} else {
				input2 -= input1;
			}
		}

		greatestCommonDivisor = input1;

		OutOfRangeException problem = new OutOfRangeException("Greatest Common Divisor is 1.");
		if (greatestCommonDivisor == 1)
			throw problem;

		System.out.println("Greatest Common Divisor is " + greatestCommonDivisor + ".");

	}
}
