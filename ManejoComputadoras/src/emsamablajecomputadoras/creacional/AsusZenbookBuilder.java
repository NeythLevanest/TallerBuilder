package emsamablajecomputadoras.creacional;

public class AsusZenbookBuilder extends BuilderComputer {

	@Override
	public void buildMainboard() {
		Mainboard placa= new Mainboard("Prime","Z370");
		computador.setPlaca(placa);		
	}

	@Override
	public void buildSOperativo() {
		SistemaOperativo so=new SistemaOperativo("Windows 10",64,"Home");
		computador.setOs(so);
		
	}

	@Override
	public void buildComputador() {
		computador.setAlmacenamiento(500);
		computador.setRam(16);
		computador.setTipoRam("ddr3");
		computador.setTipoAlmacenamiento("SSD");
		computador.setMarca("Asus");
		computador.setModelo("Zenbook");		
	}
		
}
