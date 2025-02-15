package springCore.spring1;

public class PetrolEngin implements Engin {

	public PetrolEngin() {
	 System.out.println("PetrolEngin constructor");// TODO Auto-generated constructor stub
}
	@Override
	public int start() {
	System.out.println("Petrol Engine");
		return 1;
	}

}
