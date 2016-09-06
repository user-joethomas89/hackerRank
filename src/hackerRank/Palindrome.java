package hackerRank;

import java.util.Scanner;

public class Palindrome {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int loopControl = 0;
		while (loopControl < input.length() / 2) {
			if (input.charAt(loopControl) == input.charAt(input.length() - 1 - loopControl)) {
				loopControl++;
			} else {
				System.out.println("No");
				loopControl = -1;
				break;
			}
		}
		if (loopControl != -1) {
			System.out.println("Yes");
		}
		scanner.close();
		
	}
}
