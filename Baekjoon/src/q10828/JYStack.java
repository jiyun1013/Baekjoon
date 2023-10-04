package q10828;

public class JYStack {
//	private int N;
//	private int[] JYS = new int[N];
	private int JYS[];
	private int top;

	public JYStack(int size) {
		JYS = new int[size];
		top = -1;
	}

//	public void JYStack(int N) {
//		this.N = N;
//		this.JYS[] = JYS[N];
//	}

	public void push(int X) {
		JYS[++top] = X;

//		for (int i = 0; i < N; i++) {
//			JYS[i] = p;
//		}
	}

	public void pop() {
		if (top == -1) {
			System.out.println(top);
		} else {
			System.out.println(JYS[top--]);
		}
	}

	public void size() {
		System.out.println(top + 1);
//		int ct = 0;
//		for (int i = 0; i < N; i++) {
//			if (JYS[i] <= Integer.MAX_VALUE && JYS[i] >= Integer.MIN_VALUE) {
//				ct++;
//			}
//		}
//		System.out.println(ct);
	}

	public void empty() {
		if (top == -1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
//		for (int i = 0; i < N; i++) {
//			if (JYS[i] <= Integer.MAX_VALUE && JYS[i] >= Integer.MIN_VALUE) {
//				System.out.println("0");
//			} else {
//				System.out.println("1");
//			}
//		}
	}

	public void top() {
		if (top == -1) {
			System.out.println(top);
		} else {
			System.out.println(JYS[top]);
		}
//		for (int i = 0; i < N; i++) {
//			if (JYS[i] <= Integer.MAX_VALUE && JYS[i] >= Integer.MIN_VALUE) {
//				System.out.println(JYS[i]);
//			} else {
//				System.out.println("-1");
//			}
//		}
	}
}