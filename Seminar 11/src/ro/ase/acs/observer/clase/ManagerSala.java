package ro.ase.acs.observer.clase;

public class ManagerSala extends ManagerSalaAbstract {

	
	public void anuntaMeci(String tipMeci) {
		super.trimiteNotificare("Va avea loc un meci de "+ tipMeci+ " !");
		
	}
}
