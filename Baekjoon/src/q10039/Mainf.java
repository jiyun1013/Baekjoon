package q10039;

public class Mainf {
	private int[] ar;
	private int sum;

	Mainf() {
	}

	public Mainf(int[] ar) {
		this.ar = ar;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 40) {
				ar[i] = 40;
			}
			sum += ar[i];
		}
	}

	void print() {
		System.out.println(sum / ar.length);
	}
}