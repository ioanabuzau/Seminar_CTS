package ro.ase.cts.simpleFactory;

public class FactoryPersonal {
	
	public PersonalSpital createPersonal(TipPersonal tip, String nume, int salariu) throws Exception {
		switch(tip) {
		
			case Medic:
				{
					return new Medic(nume, salariu);
				}
			case Brancardier:
				{
					return new Brancardier(nume, salariu);
				
				}
			case Asistent:
				{
					return new Asistent(nume, salariu);
				
				}
			default:
				throw new Exception();
		
		}
	}

}
