package ro.ase.cts.factoryMethod.main;

import ro.ase.cts.factoryMethod.FactoryPersonal;
import ro.ase.cts.factoryMethod.PersonalSpital;
import ro.ase.cts.factoryMethod.factoryAsistent;
import ro.ase.cts.factoryMethod.factoryMedic;

public class main {
	  public static void printeazaPersonalSpital(FactoryPersonal factoryPersonal, String nume, int salariu) {
	        PersonalSpital personal1 = factoryPersonal.createPersonal(nume, salariu);
	        System.out.println(personal1.toString());
	    }
	  
	  // daca dorim sa mai adaugam o entitate ex: Anestezist, mai adaugam doar clasa anestezist si o clasa factoryAnestezist
	    public static void main(String[] args) {
	        FactoryPersonal factoryPersonal = new factoryMedic();
	        printeazaPersonalSpital(factoryPersonal, "Ion", 1200);
	    }
}
