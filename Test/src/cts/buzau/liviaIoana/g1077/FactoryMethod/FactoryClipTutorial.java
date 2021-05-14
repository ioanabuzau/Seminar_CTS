package cts.buzau.liviaIoana.g1077.FactoryMethod;

public class FactoryClipTutorial implements Factory {

	@Override
	public IClip creazaClip(int i) {
		
		return new ClipTutorial(i);
	}

}
