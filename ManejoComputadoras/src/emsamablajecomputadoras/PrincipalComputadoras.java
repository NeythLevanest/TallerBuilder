/**
 * 
 */
package emsamablajecomputadoras;

import emsamablajecomputadoras.creacional.*;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Necesito ensamblar 2 computadoras
		// AsusROGE
		ComputerDirector directorRoge = new ComputerDirector(new AsusROGEBuilder());
		directorRoge.ConstructComputer();
	    Computador computadorARoge = directorRoge.getBuilderComputer();
	    computadorARoge.toString();
	    computadorARoge.getTipoRam();
		
		Computador roge = new Computador();
		
		
		
		// AsusZenbook
		Computador zenbook = new Computador(/*todos los atributos*/);
		
		//Mostrar las caracteristicas de ambas computadoras 
		roge.toString();
		zenbook.toString();

	}

}
