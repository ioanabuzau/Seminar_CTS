package cts.buzau.liviaIoana.g1077.Decorator;

public class ClipVideoLive implements IClip{

	private String denumire;
	private int nrMinute;
	public ClipVideoLive(String denumire,int i) {
		super();
		this.denumire = denumire;
		this.nrMinute = i;
	}
	
	
	public String getDenumire() {
		return denumire;
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
