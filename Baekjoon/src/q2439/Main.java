package q2439;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		for (int i = 0; i < N; i++) {
			// ' ' 출력
			for (int j = N - i; j > 1; j--) {
				System.out.print(" ");
			}
			// '*' 출력
			for(int j = 0; j < 1+i ;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		for (int i = 0; i < N; i++) {
//			for (int j = N; j > i + 1; j--) {
//				System.out.print("?");
//				for (int z = 0; z <= j; z++) {
//					System.out.print("*");
//				}
//			}
//			System.out.println("*");
//		}  내가 시도하다가 안된거

	}
}