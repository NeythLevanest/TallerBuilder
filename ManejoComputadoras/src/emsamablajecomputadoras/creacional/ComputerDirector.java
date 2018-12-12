package emsamablajecomputadoras.creacional;

public class ComputerDirector {
	private BuilderComputer builder;
	
	public ComputerDirector(BuilderComputer builder) {
		this.builder=builder;
	}
	
	public void constructComputer() {
		builder.crearComputador();
		builder.buildMainboard();
		builder.buildSOperativo();
		builder.buildComputador();
	}
	public void setComputadorBuilder(BuilderComputer builder) {
		this.builder = builder;
	}
	
	public Computador getBuilderComputer() {
		return builder.getComputador();
	}
	
}
