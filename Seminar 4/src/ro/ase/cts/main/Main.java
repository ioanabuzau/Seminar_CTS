package ro.ase.cts.main;

import ro.ase.cts.clase.DepartamentFinanciar;
import ro.ase.cts.clase.DepartamentFinanciarEager;

public class Main {

	public static void main(String[] args) {
		DepartamentFinanciarEager primulDepartamentFinanciarEager = 
				DepartamentFinanciarEager.getInstance();
		DepartamentFinanciarEager alDoileaDepartamentFinanciarEager = 
				DepartamentFinanciarEager.getInstance();
		
		primulDepartamentFinanciarEager.setDirector("Gigel");
		alDoileaDepartamentFinanciarEager.setNrAngajati(20);
		
		System.out.println(primulDepartamentFinanciarEager.toString());
		System.out.println(alDoileaDepartamentFinanciarEager.toString());
		
		DepartamentFinanciar primulDepartamentFinanciar =
				DepartamentFinanciar.getInstance(10, "Gigel", 4000);
		DepartamentFinanciar alDoileaDepartamentFinanciar =
				DepartamentFinanciar.getInstance(20, "Andreescu", 5000);
		
		System.out.println(primulDepartamentFinanciar.toString());
		System.out.println(alDoileaDepartamentFinanciar.toString());
	}

}
