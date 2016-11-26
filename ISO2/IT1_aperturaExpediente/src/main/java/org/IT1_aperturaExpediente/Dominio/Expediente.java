package org.IT1_aperturaExpediente.Dominio;

import org.IT1_aperturaExpediente.Persistencia.*;

public class Expediente {
	private Radar radar;
	private int n;
	public Expediente(Radar radar,int n){
		this.radar=radar;
		this.n=n;
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
