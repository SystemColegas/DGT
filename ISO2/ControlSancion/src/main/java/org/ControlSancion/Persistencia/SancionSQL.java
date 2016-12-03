package org.ControlSancion.Persistencia;

public class SancionSQL {

	Agente agente;
	public SancionSQL(){
		agente=new Agente();
	}
	
	public void pagado(int id){
		String cadena;
		cadena="";
		agente.update(cadena);
		
	}
	public Sancion leer_sancion(int n){
		String cadena="";
		return new Sancion()
	}
	public int n_sanciones(){
		String cadena="SELECT count(*) FROM Sancion";
		
		agente.leer(cadena);
	}
	public void actualizarPuntos(int dniConductor){
		String cadena="";
		agente.update(cadena);
	}

}
