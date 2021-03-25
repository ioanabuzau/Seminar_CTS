package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.FactoryPersonal;
import ro.ase.cts.simpleFactory.PersonalSpital;
import ro.ase.cts.simpleFactory.TipPersonal;

public class Program {

	public static void main(String[] args) {
		
		try {
			FactoryPersonal factoryPersonal = new FactoryPersonal();
			
			PersonalSpital personal1;
			PersonalSpital personal2;
			personal1=factoryPersonal.createPersonal(TipPersonal.Medic, "Andrei", 500);
			personal2=factoryPersonal.createPersonal(TipPersonal.Brancardier, "Mihai", 500);

			System.out.println(personal1.toString());
			System.out.println(personal2.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
