package cts.buzau.liviaIoana.g1077.FactoryMethod;

public class ClipVideoLive implements IClip{

	private String denumire;
	private int nrMinute;
	public ClipVideoLive(int i) {
		super();
		this.denumire = "Denumire test";
		this.nrMinute = i;
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
	public void start() {

			System.out.println("S-a pornit clipul video live cu lungimea de " + nrMinute +"min");		
	}
	
}
