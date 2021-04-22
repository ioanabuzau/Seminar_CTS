package ro.ase.cts.flyweight.clase;

public class Cilent implements Flyweight{

	private String nume;
	private String nrTelefon;
	private String email;
	
	public Cilent(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cilent [nume=" + nume + ", nrTelefon=" + nrTelefon + ", email=" + email + "]";
	}


	@Override
	public void printeazaRezervare() {
		System.out.println(toString());
		
	}

}
