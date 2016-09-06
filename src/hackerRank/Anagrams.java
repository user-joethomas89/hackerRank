package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");

	}

	private static boolean isAnagram(String a, String b) {

		char array1[] = a.toLowerCase().toCharArray();
		char array2[] = b.toLowerCase().toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		if (Arrays.equals(array1, array2)) {
			return true;
		} else {
			return false;
		}
	}

}
