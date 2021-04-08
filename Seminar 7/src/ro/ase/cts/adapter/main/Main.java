package ro.ase.cts.adapter.main;

import ro.ase.cts.adapter.classes.Creditable;
import ro.ase.cts.adapter.classes.Leasing;
import ro.ase.cts.adapter.classes.LeasingAdapter;
import ro.ase.cts.adapter.classes.LeasingAdapterClase;

public class Main {

	public static void afiseazaInformatiiCredit(Creditable credit) {
		credit.oferaCredit();
	}
	public static void main(String[] args) {
		
		Leasing leasing = new Leasing("Andrei");
		LeasingAdapter leasingAdapter = new LeasingAdapter(leasing);
		afiseazaInformatiiCredit(leasingAdapter);
		
		LeasingAdapterClase leasingAdapterClase = new LeasingAdapterClase("Popescu");
		afiseazaInformatiiCredit(leasingAdapterClase);
	}

}
