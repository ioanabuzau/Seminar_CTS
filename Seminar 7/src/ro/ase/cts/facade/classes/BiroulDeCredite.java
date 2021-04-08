package ro.ase.cts.facade.classes;

public class BiroulDeCredite{

	public static boolean areCreante(Persoana persoana) {
		return Integer.parseInt(""+persoana.getCnp().charAt(9))%2==0;
	}
}
