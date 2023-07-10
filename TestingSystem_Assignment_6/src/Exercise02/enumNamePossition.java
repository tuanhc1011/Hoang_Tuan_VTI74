package Exercise02;

public class enumNamePossition {
	public enum positionName {
		DEV, TEST, SCRUM_MASTER, PM
	}

	@Override
	public String toString() {
		return "enumNamePossition [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
