package Exercise02;

import java.util.ArrayList;

public class question04 {
	public static void main(String[] args) {
		try {
			ArrayList<String> departmentName = new ArrayList<String>();
			departmentName.add("DEV");
			departmentName.add("STUDENT");
			departmentName.add("LECTURES");
			System.out.println("Tên phòng ban đó là: " + departmentName.get(4));
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("cannot find department");
		}
	}
}
