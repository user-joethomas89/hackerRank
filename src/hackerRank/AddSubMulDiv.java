package hackerRank;

public class AddSubMulDiv {

	public void add(int[] number1, int[] number2, int maxLength) {

		int result[] = new int[maxLength + 1];
		int carry = 0;
		int k, p, sum;
		for (k = 0; k < maxLength; k++) {
			sum = number1[k] + number2[k] + carry;
			if (sum >= 10) {
				result[k] = sum % 10;
				carry = 1;
			} else {
				result[k] = sum;
				carry = 0;
			}
		}
		result[maxLength] = carry;
		System.out.print("Sum: ");
		if (result[maxLength] != 0) {
			System.out.printf("%d", result[maxLength]);
		}
		for (p = maxLength - 1; p >= 0; p--) {
			System.out.printf("%d", result[p]);
		}
	}

	public void subtract(int[] number1, int[] number2, int maxLength) {
		int result[] = new int[maxLength];
		int borrow = 0;
		int k, p;
		char sign = '0';
		int[] largeNum = null;
		int[] smallNum = null;

		// Find the largest of two numbers
		for (int i = maxLength - 1; i >= 0; i--) {

			if (number1[i] > number2[i]) {
				largeNum = number1;
				smallNum = number2;
				sign = '+';
				break;
			} else if (number1[i] < number2[i]) {
				largeNum = number2;
				smallNum = number1;
				sign = '-';
				break;
			} else {
				if (i != 0)
					continue;
				sign = 'E';
			}

		}

		// Find the difference
		if (sign == 'E') {
			System.out.println("\nDifference: 0");
		} else {
			for (k = 0; k < maxLength; k++) {
				
				if (largeNum[k] > smallNum[k]) {
					result[k] = largeNum[k] - (smallNum[k] + borrow);
					borrow = 0;
				}
				else if (largeNum[k] < smallNum[k]) {
					result[k] = (10 + largeNum[k]) - (smallNum[k] + borrow);
					borrow = 1;
				} else {
					result[k] = 0;
				}
			}

			System.out.printf("\nDifference: %c", sign);
			if (result[maxLength - 1] != 0) {
				System.out.printf("%d", result[maxLength - 1]);
			}
			for (p = maxLength - 2; p >= 0; p--) {
				System.out.printf("%d", result[p]);
			}
		}
		System.out.println("");

	}

	public void multiply(String num1, String num2) {
		String n1 = new StringBuilder(num1).reverse().toString();
		String n2 = new StringBuilder(num2).reverse().toString();

		int[] d = new int[num1.length() + num2.length()];

		// multiply each digit and sum at the corresponding positions
		for (int i = 0; i < n1.length(); i++) {
			for (int j = 0; j < n2.length(); j++) {
				d[i + j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
			}
		}

		StringBuilder sb = new StringBuilder();

		// calculate each digit
		for (int i = 0; i < d.length; i++) {
			int mod = d[i] % 10;
			int carry = d[i] / 10;
			if (i + 1 < d.length) {
				d[i + 1] += carry;
			}
			sb.insert(0, mod);
		}

		// remove front 0's
		while (sb.charAt(0) == '0' && sb.length() > 1) {
			sb.deleteCharAt(0);
		}

		System.out.println("Product: " + sb.toString());
	}

	public void divide(String num1, String num2) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "2544333333333333333333333333333333333333355555555555555555555555555555555555555555555555555555555555555555555333333333333333333333333";
		String num2 = "2544333333333333333333333333333333333333355555555555555555555555555555555555555555555555555555555555555555555333333333333333333333333";
		int numLength1 = num1.length();
		int numLength2 = num2.length();
		int maxLength = numLength1 > numLength2 ? numLength1 : numLength2;

		int number1[] = new int[maxLength];
		int number2[] = new int[maxLength];
		int i, j;
		for (i = 0; i < numLength1; i++)
			number1[i] = num1.charAt(numLength1 - 1 - i) - '0';

		for (j = 0; j < numLength2; j++)
			number2[j] = num2.charAt(numLength2 - 1 - j) - '0';

		AddSubMulDiv obj = new AddSubMulDiv();
		// Addition
		obj.add(number1, number2, maxLength);
		obj.subtract(number1, number2, maxLength);
		obj.multiply(num1, num2);
		// obj.divide(num1, num2);
	}

}