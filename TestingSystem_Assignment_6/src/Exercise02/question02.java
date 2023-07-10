package Exercise02;

public class question02 {
	public static void main(String[] args) {
		try {
			int a = 7;
			int b = 1;
			float divide = a / b;
			System.out.println(divide);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("cannot devide 0");
		} finally {
			System.err.println("devide complete");
		}
	}

}
