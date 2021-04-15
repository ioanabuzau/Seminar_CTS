package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;

public class Main {

	public static void main(String[] args) {

//		GestionatMese gestionatMese = new GestionatMese();
//		Picolo picolo = new Picolo();
//	    Masa masa = new Masa(8,4);
//	    
//	    
//	    if(gestionatMese.esteMasaLibera(masa.getCod()))
//	    {
//	    	if (picolo.areMasaServetele(masa.getCod()))
//	    	{
//	    		if ( picolo.esteMasaDebarasata(masa.getCod()))
//	    			System.out.println("Veniti la masa cu codul " + masa.getCod());
//	    	}
//	    	else 
//	    		System.out.println("Mai asteptati");
//	    }
//	    else 
//    		System.out.println("Mai asteptati");
		
		Masa masa = new Masa(12,4);
		if(Facade.esteMasaValida(masa)) {
			System.out.println("Veniti la masa cu codul " + masa.getCod());}
		else {
			System.out.println("Mai asteptati");}
	}

}
