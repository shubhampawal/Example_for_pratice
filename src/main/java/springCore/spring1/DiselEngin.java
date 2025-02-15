package springCore.spring1;

public class DiselEngin implements Engin {
	 public DiselEngin() {

System.out.println("DiselEngin constructor");
	}

	@Override
	public int start() {
		System.out.println("DiselEngin");
		return 1;
	}

}
