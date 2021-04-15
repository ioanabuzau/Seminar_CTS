package ro.ase.cts.facade.clase;

 class Picolo {

	public boolean esteMasaDebarasata(int cod)
	{
		if(cod>9) return true;
		return false;
	}
	
	public boolean areMasaServetele(int cod) {
		if(cod%10==2) return true;
		return false;
	}
}
