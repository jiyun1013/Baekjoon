package q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int te = sc.nextInt();
		sc.close();
		
		if(te>=90 && te <=100) {
			System.out.println("A");
		}else if(te>=80) {
			System.out.println("B");
		}else if(te>=70) {
			System.out.println("C");
		}else if(te>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}