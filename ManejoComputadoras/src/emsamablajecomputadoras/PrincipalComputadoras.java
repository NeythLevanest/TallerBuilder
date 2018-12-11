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
<<<<<<< HEAD
		Computador roge = new Computador(/*todos los atributos
=======
		ComputerDirector directorRoge = new ComputerDirector(new AsusROGEBuilder());
		directorRoge.ConstructComputer();
	    Computador computadorARoge = directorRoge.getBuilderComputer();
	    computadorARoge.toString();
	    computadorARoge.getTipoRam();
		
		Computador roge = new Computador();
		
		
>>>>>>> 21e2b6565669aad6b36d7e16757e7f5c6b0317b9
		
		// AsusZenbook
		Computador zenbook = new Computador(/*todos los atributos*/);
		
		//Mostrar las caracteristicas de ambas computadoras 
		
		roge.toString();
		zenbook.toString();

	}

}
