package emsamablajecomputadoras.creacional;

public abstract class BuilderComputer {
   protected Computador computador;
   
   public Computador getComputador(){
	   return computador;
   }
   public void crearComputador() {
	   computador = new Computador();
   }
   
   public abstract void buildMainboard();
   public abstract void buildSOperativo();
   

}
