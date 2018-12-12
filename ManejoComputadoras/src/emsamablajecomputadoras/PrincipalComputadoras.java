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
	    ComputerDirector comDirectorRoge = new ComputerDirector(new AsusROGEBuilder());
	    ComputerDirector comDirectorZenbook = new ComputerDirector(new AsusZenbookBuilder());
	    comDirectorRoge.constructComputer();;
	    comDirectorZenbook.constructComputer();;
	    
	    // AsusROGE
		//Computador roge = new Computador();
		Computador roge = comDirectorRoge.getBuilderComputer();
		// AsusZenbook
		//Computador zenbook = new Computador();
		Computador zenbook = comDirectorZenbook.getBuilderComputer();
		//Mostrar las caracteristicas de ambas computadoras 
		
		System.out.println(roge.toString());
		System.out.println("Nombre: "+roge.getMarca());
		System.out.println("Modelo: "+roge.getModelo());
		System.out.println("Ram: " +roge.getTipoRam()+" "+roge.getRam());
		System.out.println("Sistema Operativo: "+roge.getOs().toString());
		System.out.println("Procesador: "+roge.getPlaca().toString());
		
		System.out.println(zenbook.toString());
		System.out.println("Nombre: "+zenbook.getMarca());
		System.out.println("Modelo: "+zenbook.getModelo());
		System.out.println("Ram: " +zenbook.getTipoRam()+" "+roge.getRam());
		System.out.println("Sistema Operativo: "+zenbook.getOs().toString());
		System.out.println("Procesador: "+zenbook.getPlaca().toString());
		
		
		

	}

}
