package ro.ase.cts.adapter.classes;

public class LeasingAdapter implements Creditable {

	Leasing leasing;
	
	public LeasingAdapter(Leasing leasing) {
		super();
		this.leasing=leasing;
	}

	@Override
	public void oferaCredit() {
		this.leasing.oferaLeasing();
		
	}
	
}
