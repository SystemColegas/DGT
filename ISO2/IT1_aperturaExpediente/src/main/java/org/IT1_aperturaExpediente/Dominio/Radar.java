package org.IT1_aperturaExpediente.Dominio;


import java.util.Random;

import org.IT1_aperturaExpediente.Persistencia.*;
public class Radar {
	private String localizacion;
	private int velocidadRadar;
	private Vehiculo veh;
	
	public Radar(String localizacion,int velocidadRadar){
		this.localizacion = localizacion;
		this.velocidadRadar=velocidadRadar;
		leer_VehiculoAleatorio();
	}
	
	public int getVelocidadRadar() {
		return velocidadRadar;
	}


	public void setVelocidadRadar(int velocidadRadar) {
		this.velocidadRadar = velocidadRadar;
	}


	public Vehiculo getVeh() {
		return veh;
	}


	public void setVeh(Vehiculo veh) {
		this.veh = veh;
	}

	
	public String getLocalizacion() {
		return localizacion;
	}


	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}


	
	
	public void  leer_VehiculoAleatorio(){
		Random rd = new Random();
		try {
			Aux auxiliar=new Aux();
			int randomCoche  = (int) rd.nextInt(10);
			if(randomCoche==0){
				randomCoche=rd.nextInt(8)+1;
			}
			
				this.veh= new Vehiculo(auxiliar.leerCocheAleatorio(randomCoche),velocidadRadar);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}
