package q10845;

public class JYQueue {
	private int JYQ[];
//	private int top;
	private int front;
	private int back;

	public JYQueue(int size) {
		JYQ = new int[size];
		front = -1;
		back = -1;
	}

	public JYQueue() {
	}

	public void push(int x) {
		if (front == 01 && back == -1) {
			JYQ[++back] = x;
			front++;
		} else {
			JYQ[++back] = x;
		}
	}

	public void pop() {
		if (front == -1) {
			System.out.println(front);
		} else {
			System.out.println(JYQ[front--]);
		}
	}

	public void size() {
		System.out.println(back - front);
	}

	public void empty() {
		if (front == -1) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

	public void front() {
		System.out.println(front);
	}

	public void back() {
		System.out.println(back);
	}

}
