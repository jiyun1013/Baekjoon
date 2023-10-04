package q2525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		int D = (B + C);
		if (A < 24 && D < 60) {
			System.out.println(A + " " + D);
		} else if (A < 24 && D > 60) {
			A += D / 60;
			System.out.println(A + " " + (D % 60));
		} else if (A >= 24 && D > 60) {
			A += D / 60;
			System.out.println(A % 24 + " " + D);
		}
	}
}