package emsamablajecomputadoras.creacional;

public class ComputerDirector {
	private BuilderComputer builder;
	
	public ComputerDirector(BuilderComputer builder) {
		this.builder=builder;
	}
	
	public void ConstructComputer() {
		builder.buildMainboard();
		builder.buildSOperativo();
		builder.buildComputador();
	}
	
	public Computador getBuilderComputer() {
		return builder.getComputador();
	}
	
}
