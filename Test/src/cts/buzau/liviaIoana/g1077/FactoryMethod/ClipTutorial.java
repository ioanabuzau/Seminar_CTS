package cts.buzau.liviaIoana.g1077.FactoryMethod;

public class ClipTutorial implements IClip {

	private String denumire;
	private int nrMinute;
	public ClipTutorial(int min) {
		super();
		this.denumire = "Clip tutorial";
		this.nrMinute = min;
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
		System.out.println("S-a pornit clipul video de tip tutorial cu un numar de minute =  " + nrMinute);		

		
	}
	
	
}
