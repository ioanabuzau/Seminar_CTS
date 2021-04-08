package ro.ase.cts.adapter.classes;

public class Leasing {
	String nume;
	
	public Leasing(String nume) {
		super();
		this.nume = nume;
	}

	public void oferaLeasing() {
		System.out.println("I se ofera un Leasing lui " + nume);
	}
}
