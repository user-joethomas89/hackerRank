package hackerRank;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		input = input.trim();
		String delim = "[ .!,'@_?]+";
		String[] tokens = input.split(delim);
		if (input.length() > 400000){
			scanner.close();
			return;
		} else if (input.length() == 0) {
			System.out.println("0");
			scanner.close();
			return;
		}
		System.out.println(tokens.length);
		for (String string : tokens) {
			System.out.println(string);
		}
		scanner.close();
	}

}
