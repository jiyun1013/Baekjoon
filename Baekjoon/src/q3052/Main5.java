package q3052;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		int cnt = 0;
		boolean b1;
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt() % 42;
		}
		sc.close();
		for (int i = 0; i < ar.length; i++) {
			b1 = false;
			for (int k = i + 1; k < ar.length; k++) {
				if (ar[i] == ar[k]) {
					b1 = true;
				}
			}
			if (b1 == false) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}