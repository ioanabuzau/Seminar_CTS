package ro.ase.cts.simpleFactory;

public class Medic  extends PersonalSpital{

	public Medic(String nume, int salariul) {
		super(nume, salariul);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Medic [Salariu=" + getSalariu() + ", Nume=" + getNume() + "]";
	}

}
