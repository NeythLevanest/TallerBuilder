package emsamablajecomputadoras.creacional;

public class AsusROGEBuilder extends BuilderComputer{
	

	@Override
	public void buildMainboard() {
		Mainboard placa = new Mainboard("Strix", "x99"); 
		computador.setPlaca(placa);
		
	}

	@Override
	public void buildSOperativo() {
		SistemaOperativo so = new SistemaOperativo("Windows 10 ", 64,"PRO");
		computador.setOs(so);
		
	}

	@Override
	public void buildComputador() {
		computador.setModelo("ROG");
		computador.setMarca("Asus");
		computador.setRam(32);
		computador.setTipoRam("ddr4");
		computador.setTipoAlmacenamiento("HDD");
		computador.setAlmacenamiento(1000);
	}

}
