package org.IT1_aperturaExpediente.Dominio;

import java.util.Random;

public class GestorRadar {
	private String [] ciudades;
	private Radar radar;
	public GestorRadar() {
		ciudades = new String[10];
		rellenarCiudades();
	}

	public void rellenarCiudades(){
		ciudades[0]="Ciudad Real";
		ciudades[1]="Daimiel";
		ciudades[2]="Bolaños";
		ciudades[3]="Villarrubia";
		ciudades[4]="Herencia";	
		ciudades[5]="Madridejos";
		ciudades[6]="Consuegra";
		ciudades[7]="Alcázar";
		ciudades[8]="Villarta";
		ciudades[9]="Puertollano";
		
	}
	public Object[] getVehiculo(Radar rad){
		Object[] datosVeh=new Object[]{rad.getLocalizacion(), rad.getVeh().getMatricula(),rad.getVeh().getVelocidad(),rad.getVelocidadRadar(),rad.getVeh().isMultado()};
		return datosVeh;
	}
	public  Object[] VehiculoAleatorio(){
		Random rd = new Random();
		int velRanRadar;
		velRanRadar  = (int) rd.nextInt(10);
		int velRadar[]=new int[]{30,40,50,60,70,80,90,100,110,120};
			int randomRadar  = (int) rd.nextInt(5);
			this.radar=new Radar(ciudades[randomRadar],velRadar[velRanRadar]);
			return getVehiculo(radar);
			
	}

	public Radar getRadar() {
		return radar;
	}

	public void setRadar(Radar radar) {
		this.radar = radar;
	}

	
}