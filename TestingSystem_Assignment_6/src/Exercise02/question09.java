package Exercise02;

import java.util.ArrayList;

public class question09 {
	public static void main(String[] args) {
		System.out.println("Tạo Position");
		position pos1 = new position();
		System.err.println(pos1);

		department dep1 = new department();
		department dep2 = new department();
		department dep3 = new department();
		department dep4 = new department();
		ArrayList<department> list = new ArrayList<department>();
		list.add(dep1);
		list.add(dep2);
		list.add(dep3);
		list.add(dep4);
		System.err.println("thông tin phòng ban vừa nhập: ");
		for (department department : list) {
			System.err.println(department);
		}
	}

}
