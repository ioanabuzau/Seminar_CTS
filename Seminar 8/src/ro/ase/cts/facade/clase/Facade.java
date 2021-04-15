package ro.ase.cts.facade.clase;

public class Facade {

	public static boolean esteMasaValida(Masa masa) {
		GestionatMese gestionatMese = new GestionatMese();
		Picolo picolo = new Picolo();
		 if(gestionatMese.esteMasaLibera(masa.getCod()))
		    {
		    	if (picolo.areMasaServetele(masa.getCod()))
		    	{
		    		if ( picolo.esteMasaDebarasata(masa.getCod()))
		    			return true;
		    	}
		    }
		    
	    return false;
	}
}
