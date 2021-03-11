package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.classes.Angajat;
import ro.ase.cts.classes.Aplicant;
import ro.ase.cts.classes.Student;
import ro.ase.cts.readers.AngajatReader;
import ro.ase.cts.readers.AplicantReader;
import ro.ase.cts.readers.ElevReader;

public class Program {
	
	public static List<Aplicant> readAplicants( AplicantReader reader) throws FileNotFoundException {
		return reader.readAplicants();
	}

	public static void main(String[] args) {
		System.out.println(Angajat.getSumaFinantata());
		System.out.println(Student.getSumaFinantata());
		List<Aplicant> listaAplicant;
		try {
			listaAplicant = readAplicants(new ElevReader("elevi.txt"));

			for(Aplicant aplicant:listaAplicant) {
				System.out.println(aplicant.toString());
				aplicant.afisareSumaFinantata();
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
