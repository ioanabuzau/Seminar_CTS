package cts.buzau.liviaIoana.g1077.Decorator;

public class DecoratorClipVideoReclame extends AbstractDecoratorClipReclame{

	private String denumire;
	private int durataReclama;
	public DecoratorClipVideoReclame(IClip clip, int durataReclama) {
		super(clip, durataReclama);
		this.durataReclama=durataReclama;
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afiseazaReclama() {
		System.out.println("Clipului video Live i s-a adaugat o reclama de "+ durataReclama+" minute" );
		
	}

}
