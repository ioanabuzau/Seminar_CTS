package ro.ase.cts.clase;

public class Birou {
	
	private String numeBirou;
	private String numeManager;
	private String numarTelefon;
	
	private static Birou birou = null;
	
	private Birou(String nume, String manager, String telefon)
	{
		this.numeBirou = nume;
		this.numeManager = manager;
		this.numarTelefon = telefon;
	}
	
	public static synchronized Birou getInstance(String nume, String manager, String telefon)
	{
		if(birou==null) {
			birou = new Birou(nume, manager, telefon);
		}
		return birou;
	}

	@Override
	public String toString() {
		return "Birou [nume= " + numeBirou + ", manager= " + numeManager + ", telefon= " + numarTelefon + "]";
	}
	
	

}
