package q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();

		int s1 = n2 / 100;
		int s2 = n2 % 100 / 10;
		int s3 = n2 % 10;

		System.out.println(n1 * s3);
		System.out.println(n1 * s2);
		System.out.println(n1 * s1);
		System.out.println(n1 * n2);
	}
}