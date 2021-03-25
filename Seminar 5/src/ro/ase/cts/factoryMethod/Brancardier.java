package ro.ase.cts.factoryMethod;

public class Brancardier extends PersonalSpital {

	public Brancardier(String nume, int salariul) {
		super(nume, salariul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Brancardier [Salariu=" + getSalariu() + ", Nume=" + getNume() + "]";
	}

}
