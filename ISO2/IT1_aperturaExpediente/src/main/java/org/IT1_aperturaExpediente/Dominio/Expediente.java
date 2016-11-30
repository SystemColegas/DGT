package org.IT1_aperturaExpediente.Dominio;
/*
Version 1.1.0 Se ha añadido un nuevo constructor de expediente.

*/
import org.IT1_aperturaExpediente.Persistencia.*;

public class Expediente {
	private Radar radar;
	private int n;
	public Expediente(Radar radar,int n){
		this.radar=radar;
		this.n=n;
	}
	public Expediente(int n,int matri,int velocidad, int velmax,String localizacion){
		radar=new Radar(localizacion,velmax,velocidad,matri);
	}
	public void insertarExpediente(){
		try {
			Aux auxiliar=new Aux();
			auxiliar.insertarExpediente(n,radar.getVeh().getMatricula(),radar.getVeh().getVelocidad(),radar.getVeh().getVelocidadMax(),radar.getLocalizacion());
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}
