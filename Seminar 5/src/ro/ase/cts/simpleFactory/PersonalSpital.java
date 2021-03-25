package ro.ase.cts.simpleFactory;

public abstract class PersonalSpital {
	
	private int salariu;
	private String nume;
	
	public PersonalSpital(String nume, int salariul) {
		super();
		this.nume=nume;
		this.salariu=salariul;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

}
