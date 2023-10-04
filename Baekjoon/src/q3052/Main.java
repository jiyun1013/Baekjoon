package q3052;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		int[] n1 = new int[10];
		int cnt = 0;

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			n1[i] = ar[i] % 42;
		}

		for (int j = 0; j < n1.length; j++) {
			for (int k = 0; k <= 41; k++) {
				if (n1[j] == k) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
		sc.close();
	}
}