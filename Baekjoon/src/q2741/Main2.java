package q2741;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = num; i > 0; i--) {
			System.out.println(i);
		}
	}
}