package ro.ase.acs.command.clase;

public class ComandaDepunere extends Comanda{

	public ComandaDepunere(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}

	@Override
	public void executa() {
		super.contBancar.depunere(super.suma);
		
	}

}
