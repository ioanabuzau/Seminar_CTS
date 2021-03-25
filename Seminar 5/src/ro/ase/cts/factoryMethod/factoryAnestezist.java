package ro.ase.cts.factoryMethod;

public class factoryAnestezist implements FactoryPersonal{

	@Override
	public PersonalSpital createPersonal(String nume, int salariu) {
		// TODO Auto-generated method stub
		return new Anestezist(nume, salariu);
	}

}
