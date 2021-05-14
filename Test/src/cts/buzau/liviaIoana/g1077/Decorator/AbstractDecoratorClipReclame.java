package cts.buzau.liviaIoana.g1077.Decorator;

public abstract class AbstractDecoratorClipReclame implements IClip{
	
	private IClip clip;
	private int durataReclama;
	
	public AbstractDecoratorClipReclame(IClip clip, int durataReclama) {
		super();
		this.clip = clip;
		this.durataReclama = durataReclama;
	}
	
	public void start() {
		clip.start();
	}

	public abstract void afiseazaReclama();

}
