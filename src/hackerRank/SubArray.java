package hackerRank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class SubArray {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int total = scanner.nextInt();
		int array[] = new int[total];
		int totalNegativeSubarrays = 0;
		for (int i = 0; i < total; i++) {
			array[i] = scanner.nextInt();
			if (array[i] < 0) {
				totalNegativeSubarrays++;
			}
		}
		scanner.close();
		int j = 2;
		while (j <= total) {
			for (int i = 0; i < total; i++) {
				if ((i + j) <= total) {
					int[] array1 = Arrays.copyOfRange(array, i, i + j);
					//System.out.println(Arrays.toString(array1));
					int sum = IntStream.of(array1).sum();
					if (sum < 0) {
						totalNegativeSubarrays++;
					}
				}
			}
			j++;
		}
		System.out.println(totalNegativeSubarrays);
	}
}
