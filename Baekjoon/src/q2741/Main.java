package q2741;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		// 1.
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		System.out.println();

		// 2.
		int j = 1;
		while (j <= num) {
			System.out.println(j++);
		}
		System.out.println();

		// 3.
		int k = 1;
		do {
			System.out.println(k++);
		} while (k <= num);
	}
}