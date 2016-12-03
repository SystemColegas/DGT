package org.IT2_sancionConductor.Dominio;
/*				Gestion de Configuración
 *  
 * class Sancion version 1.0.1 -> Ya que hacia falta un atributo id
 * 
 * 
 * 
 */
import IT1.Dominio.Expediente;

public class Sancion {

	int id;
	Expediente exp;
	int dniConductor;
	boolean pagado;
	int puntos;
	int importePagar;
	
	public Sancion(Expediente exp,String nombre){
		this.exp=exp;
		dniConductor=leerDNI(nombre);
		pagado=false;
		puntos=calcularPuntos(exp);
		importePagar=calcularImporte(exp);
	}
	private int calcularImporte(Expediente exp2) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	private int calcularPuntos(Expediente exp2) {

		return 0;
	}
	private int leerDNI(String nombre) {

		return 0;
	}

}
