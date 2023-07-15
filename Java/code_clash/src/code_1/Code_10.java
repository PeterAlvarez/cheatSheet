package code_1;

import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class Code_10 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String tri = in.nextLine();

		char[] s = tri.toCharArray();
		String even = "", oneven = "";
		for (int i = 0; i < s.length; i++) {
			if (i % 2 == 1) {
				oneven = s[i] + oneven;
			}
			System.out.println(even + oneven);
		}
	}
}