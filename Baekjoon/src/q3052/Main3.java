package q3052;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] iNums = new int[10];
		int[] iNums2 = new int[42];
		int iC = 0;
		for (int i = 0; i < iNums.length; i++) {
			iNums[i] = sc.nextInt() % 42;
		}

		sc.close();

		for (int i = 0; i < iNums.length; i++) {
			for (int j = 0; j < 42; j++) {
				if (iNums[i] == j) {
					iNums2[j] += 1;
				}
			}
		}

		for (int i = 0; i < 42; i++) {
			if (iNums2[i] != 0) {
				iC++;
			}
		}
		System.out.print(iC);
	}
}