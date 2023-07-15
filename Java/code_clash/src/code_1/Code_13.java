package code_1;

import java.util.Scanner;
import java.math.*;
import java.util.Arrays;

public class Code_13 {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String d = in.next();
        String[] num=d.split(":");
        int min=0;
        	min+=Integer.parseInt(num[0])*60;
        System.out.println((min+Integer.parseInt(num[1])));
    }
}
