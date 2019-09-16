package deliverable_2;

import java.util.Scanner;

public class deliverable_2 {

	public static void main(String[] args) {
		String string1;
		String string2;
		int i = 0;
		int j = 0;
		int value1 = 0;
		int sum1 = 0;
		int value2 = 0;
		int sum2 = 0;

		System.out.print("Please type in two strings (that is two sequences of any amount of characters) here:");
		Scanner scnr = new Scanner(System.in);
		string1 = scnr.next();
		string2 = scnr.next();

		while (i < string1.length()) {
			value1 = (int) (string1.charAt((int) i));
			sum1 = value1 + sum1;
			i++;
		}

		while (j < string2.length()) {
			value2 = (int) (string2.charAt((int) j));
			sum2 = value2 + sum2;
			j++;
		}
		System.out.println(Math.abs(sum1 - sum2));
	}

}
