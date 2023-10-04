package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class First_Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		JYStack jy;
		try {
			String line = br.readLine();
			int cnt = Integer.parseInt(line);
			jy = new JYStack(cnt);
			for (int i = 0; i < cnt; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);
				String cmd = st.nextToken();
//				System.out.println(cmd);

				if (cmd.equals("push")) {
					String cmd2 = st.nextToken();
					int p = Integer.parseInt(cmd2);
					jy.push(p);
//					System.out.println(cmd2);
				} else if (cmd.equals("pop")) {
					jy.pop();
				} else if (cmd.equals("size")) {
					jy.size();
				} else if (cmd.equals("empty")) {
					jy.empty();
				} else if (cmd.equals("top")) {
					jy.top();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}