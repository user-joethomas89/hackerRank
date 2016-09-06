package hackerRank;

import java.util.Scanner;

public class StringCompare {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int number = scanner.nextInt();
		String minimum = input.substring(0, number);
		String maximum = input.substring(0, number);
		int length = input.length();
		for (int i = 0; i <= length - number; i++) {
			String substring = input.substring(i, i + number);
			if (substring.compareTo(minimum) < 0) {
				minimum = substring;
			} else if (substring.compareTo(maximum) > 0) {
				maximum = substring;
			}
		}
		System.out.println(minimum);
		System.out.println(maximum);
		scanner.close();

	}

}
