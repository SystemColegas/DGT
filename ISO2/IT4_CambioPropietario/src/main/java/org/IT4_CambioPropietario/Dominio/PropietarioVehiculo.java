package org.IT4_CambioPropietario.Dominio;

import org.IT4_CambioPropietario.Persistencia.*;

public class PropietarioVehiculo {
	private int dni;

	public PropietarioVehiculo(int dni){
		this.dni=dni;
		
	}
	public void cambiarPropietario(){
		try {
			AuxPropietario aux=new AuxPropietario();
			aux.cambiarPropietario(dni);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}
