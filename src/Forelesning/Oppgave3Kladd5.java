package Forelesning;

public class Oppgave3Kladd5 {

	public static void main(String[] args) {

		System.out.println(sumKvadOpp(2, 4));

	}

	public static int sumKvadOpp(int m, int n) {

		if (m == n) {
			return m * m;
		} else if (m > n) {
			return m * m + sumKvadOpp(m - 1, n);
		} else {
			return n * n + sumKvadOpp(n - 1, m);
		}
	}

}
