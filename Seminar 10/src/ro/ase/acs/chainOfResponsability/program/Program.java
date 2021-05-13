package ro.ase.acs.chainOfResponsability.program;

import ro.ase.acs.chainOfResponsability.clase.ContCurent;
import ro.ase.acs.chainOfResponsability.clase.ContDeCredit;
import ro.ase.acs.chainOfResponsability.clase.ContDeEconomii;
import ro.ase.acs.chainOfResponsability.clase.Handler;
import ro.ase.acs.chainOfResponsability.clase.RefuzaTranzactia;

public class Program {
	
	public static void main(String[] args) {
		Handler contCredit = new ContDeCredit(5000);
		Handler contCurent = new ContCurent(2000);
		Handler contEconomii = new ContDeEconomii(2100);
		Handler refuzaTranzactie = new RefuzaTranzactia();
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(refuzaTranzactie);
		
		contCurent.realizeazaPlata(5100);
	}
}
