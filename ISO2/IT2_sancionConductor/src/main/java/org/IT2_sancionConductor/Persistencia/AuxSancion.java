package org.IT2_sancionConductor.Persistencia;
/*			Gestion de Configuracion
 * 
 * AuxSancion v1.0.1 se ha corregido una conversión de tipos en el metodo contarFilas()
 * 
 * 
 */
import java.util.ArrayList;

import org.IT1_aperturaExpediente.Persistencia.Agente;


public class AuxSancion {

	private Agente a;
	
	public AuxSancion() throws Exception{
		a=new Agente();
	}
	public ArrayList<Object> leerExpediente(int n) throws Exception{
		String cadena="SELECT Id_expediente,vehiculo,Velocidad,VelocidadMAX,LocalizacionRADAR FROM Expedientes WHERE Id_expediente = '"+n+"';";
		return a.leerGeneral(cadena, n);
		
	}
	public int contarFilas() throws Exception{
		String cadena="SELECT count(*) FROM Expedientes";
		return (Integer) a.leerGeneral(cadena,1).get(0);
	}
	public void insertarSancion(){
		
	}
	
}
