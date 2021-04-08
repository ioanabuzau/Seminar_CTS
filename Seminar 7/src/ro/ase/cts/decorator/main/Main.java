package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.classes.Card;
import ro.ase.cts.decorator.classes.CardAbstract;
import ro.ase.cts.decorator.classes.DecoratorAbstract;
import ro.ase.cts.decorator.classes.DecoratorContactless;

public class Main {

	public static void main(String[] args) {

		CardAbstract cardAbstract = new Card("Andreea");
		
		cardAbstract.realizeazaPlataNormala();
		cardAbstract.realizeazaPlataOnline();
		
		DecoratorAbstract cardContactless = new DecoratorContactless(cardAbstract);
		
		cardContactless.realizeazaPlataContactless();
		cardContactless.realizeazaPlataNormala();
		cardContactless.realizeazaPlataOnline();
	
	}

}
