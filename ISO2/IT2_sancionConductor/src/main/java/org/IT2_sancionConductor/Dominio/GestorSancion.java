package org.IT2_sancionConductor.Dominio;

/*					Gestión de Configuración
 * 
 *  GestorSancion v 1.0.1 Se han arreglado algunas conversiones de tipo Object a Integer que no se hacian correctamente en el metodo leerExpedientes
 *	GestorSancion v1.1.0 se han añadido metodos set y get necesarios. 
 *
 */
import java.util.ArrayList;

import org.IT1_aperturaExpediente.Dominio.Expediente;
import org.IT1_aperturaExpediente.Persistencia.Aux;
import org.IT2_sancionConductor.Persistencia.AuxSancion;


public class GestorSancion {

	private Expediente exp[];
	
	public GestorSancion(){
		
	}
	public void leerExpedientes(){
		AuxSancion aux;
		ArrayList<Object> a;
		Aux auxit1;
		try {
			aux = new AuxSancion();
			auxit1=new Aux();
			int n=aux.contarFilas();
			for(int i=0;i<n;i++){
				a=aux.leerExpediente(i+1);
				exp[i]=new Expediente((Integer)a.get(0),(Integer)auxit1.leerCocheAleatorio((Integer)a.get(1)),(Integer)a.get(2),(Integer) a.get(3),(String)a.get(4));
			}
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
	public Expediente[] getExp() {
		return exp;
	}
	public void setExp(Expediente[] exp) {
		this.exp = exp;
	}
}
