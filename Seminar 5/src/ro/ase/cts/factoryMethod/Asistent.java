package ro.ase.cts.factoryMethod;

public class Asistent  extends PersonalSpital {

	public Asistent(String nume, int salariul) {
		super(nume, salariul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Asistent [Salariu=" + getSalariu() + ", Nume=" + getNume() + "]";
	}

}
