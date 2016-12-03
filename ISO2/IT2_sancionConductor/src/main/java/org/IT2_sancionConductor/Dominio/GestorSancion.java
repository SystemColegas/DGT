package org.IT2_sancionConductor.Dominio;
import java.util.ArrayList;

import IT1.Dominio.*;
import IT1.Persistencia.Aux;
import IT2.Persistencia.AuxSancion;
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
				exp[i]=new Expediente((int)a.get(0),(int)auxit1.leerCocheAleatorio((int)a.get(1)),(int)a.get(2),(int) a.get(3),(String)a.get(4));
			}
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}
