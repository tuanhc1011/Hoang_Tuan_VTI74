package exercise02;

public class question2 {
	public void question02() {
		System.out.println("Tao sinh vien voi phuong thuc getId:");
		students st1 = new students("Studen1");
		System.out.println("Sinh vien vua ao id la: " + st1.getId() + "Ten sinh vien: " + st1.getName());
		System.out.println("su dung phuong thuc MSV + Id tao sinh vien moi: ");
		System.out.println("Sinh vien moi la id la: " + st1.getMSVid() + "ten siinh vien" + st1.getName());
	}
}
