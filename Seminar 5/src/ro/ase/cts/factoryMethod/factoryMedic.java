package ro.ase.cts.factoryMethod;

public class factoryMedic implements FactoryPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		// TODO Auto-generated method stub
		return new Medic(nume, salariu);
	}

}
