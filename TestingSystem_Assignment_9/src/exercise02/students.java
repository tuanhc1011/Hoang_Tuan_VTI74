package exercise02;

public class students {
	public static int COUNT = 0;
	int id;
	String name;

	public students(String name) {
		super();
		this.id = ++COUNT;
		this.name = name;
	}

//// Đánh dấu method cũ
	@Deprecated
	public int getId() {
		return id;
	}

	public String getMSVid() {
		return "MSV" + id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "students [id=" + id + ", name=" + name + "]";
	}

}
