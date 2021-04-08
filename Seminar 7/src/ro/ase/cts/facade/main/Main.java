package ro.ase.cts.facade.main;

import ro.ase.cts.facade.classes.BiroulDeCredite;
import ro.ase.cts.facade.classes.Facade;
import ro.ase.cts.facade.classes.Persoana;
import ro.ase.cts.facade.classes.Politie;

public class Main {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("Ioana", "2995485642209");
		// daca nu aveam facade
		if(persoana.getVarsta()>=18) {
			if(Politie.esteUrmarit(persoana)) {
				if(BiroulDeCredite.areCreante(persoana))
					System.out.println(persoana.getNume() +" primeste credit");
				
				else System.out.println(persoana.getNume() +" nu primeste credit");
			}
			else System.out.println(persoana.getNume() +" nu primeste credit");
		}
		else System.out.println(persoana.getNume() +"nu primeste credit");
			
		//daca avem facade
		if(Facade.esteApt(persoana))
			System.out.println(persoana.getNume() + " primeste credit");
		else
			System.out.println(persoana.getNume() + " nu primeste credit");
	}

}
