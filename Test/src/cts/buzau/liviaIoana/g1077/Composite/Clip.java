package cts.buzau.liviaIoana.g1077.Composite;

public class Clip implements IClip {

	private String denumire;
	private int nrMinute;
	public Clip(String denumire,int min) {
		super();
		this.denumire = denumire;
		this.nrMinute = min;
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
		System.out.println("S-a pornit clipul video de tip tutorial cu un numar de minute =  " + nrMinute);		

		
	}
	
	
}
