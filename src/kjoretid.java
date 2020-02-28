
public class kjoretid {

	public static void main(String[] args) {
		tid(100000000L);
		tid(1000000000L);
		tid(10000000000L);
	}

	public static void tid(long n) { // ...fyll ut
		long start  = System.currentTimeMillis();
		long k = 0;
		for (long i = 1; i <= n; i++) {
		}
		long end = System.currentTimeMillis();

		System.out.println(end-start);
	}
}
