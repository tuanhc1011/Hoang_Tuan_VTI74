package Exercise02;

public class Question1 {

	public static void main(String[] args) {
		try {
			int a = 7;
			int b = 0;
			int result = a / b;
			System.out.println(result);

		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("cannot divide 0");
		}

	}
}