package org.IT1_aperturaExpediente.Dominio;

import java.util.Random;

public class Vehiculo {
	private int matricula;
	private int velocidad;
	private int velocidadMax;
	

	private boolean multado;
	
	public Vehiculo(int matricula,int velocidadMax) {
		this.matricula = matricula;
		this.velocidadMax=velocidadMax;
		velocidad  = 0; 
		multado = false;
		generarVelocidad();
	}
	
	public void generarVelocidad(){
		Random rd = new Random();
		
		switch(velocidadMax){
		case 30:
			 velocidad = (int) rd.nextInt(81); //creo un random entre 20 y 81.
			 if(velocidad <= 15){
				 velocidad+=(int) rd.nextInt(50);
			 }
			 if(velocidad>=31){
				 multado = true;
			 }
			break;
		case 40:
			 velocidad = (int) rd.nextInt(91);//creo un random entre 30 y 91.
			 if(velocidad <= 15){
				 velocidad+=(int) rd.nextInt(50);
			 }
			 if(velocidad>=41){
				 multado = true;
			 }
			break;
		case 50:
			 velocidad = (int) rd.nextInt(101); //creo un random entre 30 y 101.
			 if(velocidad <= 25){
				 velocidad+=(int) rd.nextInt(85);
			 }			
			 if(velocidad>=51 && velocidad<=101){
				 multado = true;
			 }
			 break;
		case 60:
			 velocidad = (int) rd.nextInt(131); //creo un random entre 45 y 131.
			 if(velocidad <= 35){
				 velocidad+=40;
			 }
			 if(velocidad>=61){
				 multado = true;
			 }
			 
			break;
		case 70:
			 velocidad = (int) rd.nextInt(141); //creo un random entre 55 y 141.
			 if(velocidad <= 45){
				 velocidad+=50;
			 }
			 if(velocidad>=71){
				 multado = true;
			 }
			break;
		case 80:
			 velocidad = (int) rd.nextInt(151); //creo un random entre 65 y 151.
			 if(velocidad <= 55){
				 velocidad +=60;
			 }
			 if(velocidad>=81){
				 multado = true;
			 }
			break;
		case 90:
			 velocidad = (int) rd.nextInt(161); //creo un random entre 75 y 161.
			 if(velocidad <= 60){
				 velocidad +=70;
			 }
			 if(velocidad>=91){
				 multado = true;
			 }
			break;
		case 100:
			 velocidad = (int) rd.nextInt(171); //creo un random entre 85 y 161.
			 if(velocidad <= 65){
			    velocidad +=80;

			 }
			 if(velocidad>=101){
				 multado = true;
			 }
			break;
		case 110:
			 velocidad = (int) rd.nextInt(181); //creo un random entre 95 y 181.
			 if(velocidad <= 80){
				 velocidad +=90;
			 }
			 if(velocidad>=111 ){
				 multado = true;
			 }
			break;
		case 120:
			 velocidad = (int) rd.nextInt(191); //creo un random entre 105 y 191.
			 if(velocidad <= 90){
				 velocidad +=100;
			 }
			 if(velocidad>=121){
				 multado = true;
			 }
			break;
		  }
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	public String isMultado() {
		if(multado==true){
			return "Si";
		}else{
			return "No";
		}

	}

	public void setMultado(boolean multado) {
		this.multado = multado;
	}

	public int getMatricula() {
		return  matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
	
	
	
}
