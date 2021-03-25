package ro.ase.cts.factoryMethod;

public class Anestezist extends PersonalSpital{

	public Anestezist(String nume, int salariul) {
		super(nume, salariul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Anestezist [Salariu=" + getSalariu() + ", Nume=" + getNume() + "]";
	}

}
