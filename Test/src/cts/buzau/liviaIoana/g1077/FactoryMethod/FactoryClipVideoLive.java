package cts.buzau.liviaIoana.g1077.FactoryMethod;

public class FactoryClipVideoLive implements Factory {

	@Override
	public IClip creazaClip(int i) {
		return new ClipVideoLive(i);
	}

}
