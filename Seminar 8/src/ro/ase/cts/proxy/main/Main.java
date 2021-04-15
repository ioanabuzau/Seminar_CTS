package ro.ase.cts.proxy.main;


import ro.ase.cts.proxy.clase.OperatorRezervari;
import ro.ase.cts.proxy.clase.Proxy;

public class Main {

	public static void main(String[] args) {
		OperatorRezervari operatorRezervari = new OperatorRezervari();
		Proxy proxy = new Proxy(operatorRezervari, 4);
		
		proxy.realizeazaRezervare(4);

	}

}
