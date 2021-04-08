package ro.ase.cts.facade.classes;

public class Facade {

	public static boolean esteApt(Persoana persoana) {
		if(persoana.getVarsta()>=18) 
			if(Politie.esteUrmarit(persoana)) 
				if(BiroulDeCredite.areCreante(persoana))
					return true;
		
		return false;
	}
}
