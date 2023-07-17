package Exercise02;

public class mymath {
	public static final Double pi = 3.14;

	public static double sum(int a) {
		return a + pi;
	}

	public static int max(int a, int b) {
		if (a <= b) {
			return b;
		} else {
			return a;
		}
	}

	public static int min(int a, int b) {
		if (a <= b) {
			return a;
		} else {
			return b;
		}
	}

	public static int sum(int a, int b) {
		return a + b;
	}
}
