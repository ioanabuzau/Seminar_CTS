package ro.ase.cts.proxy.clase;


public class Proxy implements IOperatorRezervare {

	private OperatorRezervari operatorRezervari;
	private int nrMinimPersoane;
	public Proxy(OperatorRezervari operatorRezervari,int nrMinim) {
		super();
		this.operatorRezervari = operatorRezervari;
		this.nrMinimPersoane = nrMinim;
	}

	@Override
	public void realizeazaRezervare(int nrPersoane) {
		
		if(nrPersoane>=nrMinimPersoane) {
			operatorRezervari.realizeazaRezervare(nrPersoane);
		}
		else {
			System.out.println("E nevoie de cel putin "+ nrMinimPersoane+" persoane pentru o rezervare. Veniti direct la restaurant!");
		}
		
	}

}
