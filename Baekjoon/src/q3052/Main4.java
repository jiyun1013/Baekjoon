package q3052;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int[] num = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			num[i] = arr[i] % 42;
		}
		sc.close();

		int cnt = 0;

		for (int k = 0; k < 42; k++) {
			if (num[0] == k || num[1] == k || num[2] == k || num[3] == k || num[4] == k || num[5] == k || num[6] == k
					|| num[7] == k || num[8] == k || num[9] == k) {
				cnt++;
			} else {
				break;
			}
		}
		System.out.println(cnt);
	}
}