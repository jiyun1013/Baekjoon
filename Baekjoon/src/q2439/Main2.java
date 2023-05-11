package q2439;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();

		for (int i = 0, j = a; i < a || j < a && j > 0; i++, j--) {
			String b = " ".repeat(j - 1);
			String s = "*".repeat(i + 1);
			System.out.println(b + s);
		}
	}
}