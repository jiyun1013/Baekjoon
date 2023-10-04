package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> jy = new Stack<Integer>();
		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
			for (int i = 0; i < cnt; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = st.nextToken();

				if (cmd.equals("push")) {
					String cmd2 = st.nextToken();
					int p = Integer.parseInt(cmd2);
					jy.push(p);
					System.out.println(cmd2);
				} else if (cmd.equals("pop")) {
					if (jy.size() > 0) {
						System.out.println(jy.pop());
					} else {
						System.out.println("-1");
					}
				} else if (cmd.equals("size")) {
					System.out.println(jy.size());
				} else if (cmd.equals("empty")) {
					if (jy.empty()) {
						System.out.println("1");
					} else {
						System.out.println("0");
					}
				} else if (cmd.equals("top")) {
					System.out.println(jy.peek());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}