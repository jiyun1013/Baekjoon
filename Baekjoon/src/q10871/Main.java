package q10871;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), X = sc.nextInt();
		int[] ar = new int[N];
		
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
			
			if (ar[i] < X) {
				System.out.print(ar[i]+" ");
			}
		}
		sc.close();
	}
}