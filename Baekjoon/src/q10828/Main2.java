package q10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main2 {
	public static void main(String[] args) {

		class Stack {
		   
		   ArrayList<Integer> sta = new ArrayList<Integer>();
		   
		   public void push(int n) {
		      sta.add(n);
		   }
		   
		   public void pop() {   
		      if(sta.size() !=0) {
		         System.out.println(sta.get(sta.size()-1));
		         sta.remove(sta.size()-1);
		      }else {
		         System.out.println(-1);
		      }
		   }
		   
		   public void top() {
		      if(sta.size()!=0) {
		         System.out.println(sta.get(sta.size()-1));
		      } else {
		         System.out.println(-1);
		      }
		   }
		   
		   public void size() {
		      System.out.println(sta.size());
		   }
		   
		   public void empty() {
		      if(sta.isEmpty()==true) {
		         System.out.println(1);
		      } else {
		         System.out.println(0);
		      }
		   }
		}

		public class Main2 {
		   public static void main(String[] args) {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      Stack sta = new Stack();
		      
		      try {
		         String line = br.readLine();
		         int n = Integer.parseInt(line);
		         while (n>0) {
		            line=br.readLine();
		            StringTokenizer st = new StringTokenizer(line);
		            String cmd = st.nextToken();
		            if (cmd.equals("push")) {
		               String cmd2=st.nextToken();
		               int p = Integer.parseInt(cmd2);
		               sta.push(p);
		            } else if (cmd.equals("pop")) {
		               sta.pop();
		            } else if (cmd.equals("top")) {
		               sta.top();
		            } else if (cmd.equals("empty")) {
		               sta.empty();
		            } else if (cmd.equals("size")) {
		               sta.size();
		            }
		            n--;
		         }
		      } catch (IOException e) {
		         e.printStackTrace();
		      }
		   }
		}
	}
}