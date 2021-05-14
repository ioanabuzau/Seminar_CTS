package cts.buzau.liviaIoana.g1077.main;

import cts.buzau.liviaIoana.g1077.FactoryMethod.Factory;
import cts.buzau.liviaIoana.g1077.FactoryMethod.FactoryClipTutorial;
import cts.buzau.liviaIoana.g1077.FactoryMethod.FactoryClipVideoLive;
import cts.buzau.liviaIoana.g1077.FactoryMethod.IClip;

public class FactoryMethodMain {

	private static void afisare(Factory factory, int  nrMinute) {
		IClip clip=factory.creazaClip(nrMinute);
		clip.start();
	}
	public static void main(String[] args) {
		afisare(new FactoryClipTutorial(),3);
		afisare(new FactoryClipTutorial(),6);
		afisare(new FactoryClipVideoLive(),3);
		afisare(new FactoryClipVideoLive(),9);

	}

}
