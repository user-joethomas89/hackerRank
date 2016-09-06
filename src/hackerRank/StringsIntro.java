package hackerRank;

import java.util.*;

public class StringsIntro {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String A = scanner.next();
		String B = scanner.next();
		System.out.println(A.length() + B.length());
		System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
		if (A != null && A.length() > 1) {
			System.out.print(A.substring(0, 1).toUpperCase() + A.substring(1) + " ");
		}
		if (B != null && B.length() > 1) {
			System.out.print(B.substring(0, 1).toUpperCase() + B.substring(1));
		}
		scanner.close();
	}
}
