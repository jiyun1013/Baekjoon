package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		JYQueue jy = new JYQueue();

		try {
			String line = br.readLine();
			int N = Integer.parseInt(line);
			for (int i = 0; i < N; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = st.nextToken();
				if (cmd.equals("push")) {
					String cmd2 = st.nextToken();
					int X = Integer.parseInt(cmd2);
					jy.push(X);
				} else if (cmd.equals("pop")) {
					jy.pop();
				} else if (cmd.equals("size")) {
					jy.size();
				} else if (cmd.equals("empty")) {
					jy.empty();
				} else if (cmd.equals("front")) {
					jy.front();
				} else if (cmd.equals("back")) {
					jy.back();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}