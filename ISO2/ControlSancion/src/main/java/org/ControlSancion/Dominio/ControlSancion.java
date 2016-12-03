package org.ControlSancion.Dominio;

import org.ControlSancion.Persistencia.SancionSQL;

public class ControlSancion {
	SancionSQL s;
	Sancion sanciones[]=null;
	public ControlSancion(){
		leerSanciones();
		s=new SancionSQL();
	}
	public void sancionPagada(Sancion san){
		
		s.pagado(san.id);
	}
	public void restarPuntos(Sancion san){
		SancionSQL s=new SancionSQL(san.id);
		s.actualizarPuntos(san.dniConductor);
	}
	public void leerSanciones(){
		SancionSQL s=new SancionSQL();
		for(int i=0;i<s.n_sanciones();i++){
			sanciones[i]=s.leer_sancion(i+1);
		}
	}
}
