package ro.ase.acs.command.program;

import ro.ase.acs.command.clase.ComandaConstituire;
import ro.ase.acs.command.clase.ComandaDepunere;
import ro.ase.acs.command.clase.ComandaRetragere;
import ro.ase.acs.command.clase.ContBancar;
import ro.ase.acs.command.clase.ManagerComenzi;

public class Program {
	public static void main(String[] args) {
		ManagerComenzi managerComenzi = new ManagerComenzi();
		ContBancar contBancar = new ContBancar("Teodora", 0);
		managerComenzi.invoca(new ComandaConstituire(contBancar, 1000));
		managerComenzi.invoca(new ComandaDepunere(contBancar, 200));
		managerComenzi.executaComanda();
		
		managerComenzi.invoca(new ComandaRetragere(contBancar, 500));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		
	}
}
