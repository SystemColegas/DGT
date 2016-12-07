package org.ControlSancion.Persistencia;

import java.sql.SQLException;
/*			Gestion de Configuracion
 * 
 * SancionSQL v 1.0.3 Se han corregido 3 errores, se han añadido throws necesarios para las excepciones 
 * 
 * 
 * 
 */
import org.IT1_aperturaExpediente.Persistencia.Agente;
import org.IT2_sancionConductor.Dominio.Sancion;

public class SancionSQL {

	Agente agente;
	public SancionSQL() throws Exception{
		agente=new Agente();
	}
	
	public void pagado(int id) throws SQLException, Exception{
		String cadena;
		cadena="";
		agente.update(cadena);
		
	}
	public Sancion leer_sancion(int n){
		String cadena="";
		return new Sancion(null, cadena);
	}
	public int n_sanciones() throws Exception{
		String cadena="SELECT count(*) FROM Sancion";
		
		return agente.leer(cadena);
	}
	public void actualizarPuntos(int dniConductor) throws SQLException, Exception{
		String cadena="";
		agente.update(cadena);
	}

}
