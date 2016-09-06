package hackerRank;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String delim = "[ .!,'@_?]+";
		String[] tokens = input.split(delim);
		System.out.println(tokens.length);
		for (String string : tokens) {
			System.out.println(string);
		}
		scanner.close();
	}

}
