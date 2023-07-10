package Exercise02;

public class question03 {
	public static void main(String[] args) {
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println(numbers[10]);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("the number not exits");
		}
	}

}
