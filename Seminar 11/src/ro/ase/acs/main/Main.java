package ro.ase.acs.main;

import ro.ase.acs.clase.ClientFidel;
import ro.ase.acs.clase.ManagerSala;
import ro.ase.acs.clase.ManagerSalaAbstract;
import ro.ase.acs.clase.Observer;

public class Main {

	public static void main(String[] args) {
		Observer c1 = new ClientFidel("Gigel");
		Observer c2 = new ClientFidel("Popescu");
		Observer c3 = new ClientFidel("Mihai");
		Observer c4 = new ClientFidel("Andrei");

		ManagerSala manager = new ManagerSala();
		
		manager.adaugaAbonat(c4);
		manager.adaugaAbonat(c1);
		manager.adaugaAbonat(c2);
		manager.adaugaAbonat(c3);
		
		manager.anuntaMeci("Fotbal");
		manager.stergeAbonat(c4);

		manager.anuntaMeci("Volei");
	}

}
