package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class QueueTest {

	List<Integer> list;
	int top = -1;

	public QueueTest() {
		list = new ArrayList<Integer>();
	}

	public void push(int n) {
		list.add(n);

	}

	public void pop() {
		if (!list.isEmpty()) {
			System.out.println(list.get(0));
			list.remove(0);
		} else {
			System.out.println(-1);
		}

	}

	public int empty() {
		if (!list.isEmpty()) {
			return 0;
		} else {
			return 1;
		}
	}

	public int front() {
		if (!list.isEmpty()) {
			return list.get(0);
		} else {
			return -1;
		}
	}

	public int back() {
		if (!list.isEmpty()) {
			return list.get(list.size() - 1);
		} else {
			return -1;
		}
	}

	public int size() {
		return list.size();
	}

}

public class Main2 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		QueueTest qt = new QueueTest();

		try {
			String n = br.readLine();
			int n1 = Integer.parseInt(n);
			while (n1 > 0) {
				String line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = st.nextToken();
				if (cmd.equals("push")) {
					String cmd2 = st.nextToken();
					int n2 = Integer.parseInt(cmd2);
					qt.push(n2);
				} else if (cmd.equals("pop")) {
					qt.pop();
				} else if (cmd.equals("size")) {
					System.out.println(qt.size());
				} else if (cmd.equals("empty")) {
					System.out.println(qt.empty());
				} else if (cmd.equals("front")) {
					System.out.println(qt.front());
				} else if (cmd.equals("back")) {
					System.out.println(qt.back());
				}
				n1--;
			}

		} catch (IOException e) {
		}
	}
}