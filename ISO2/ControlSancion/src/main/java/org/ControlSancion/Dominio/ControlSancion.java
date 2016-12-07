package org.ControlSancion.Dominio;
/*			Gestion de configuracion
 * 
 *  ControlSancion v1.0.3 se han añadido 3 try-catch faltantes
 * 
 */
import java.sql.SQLException;

import org.ControlSancion.Persistencia.SancionSQL;
import org.IT2_sancionConductor.Dominio.Sancion;

public class ControlSancion {
	SancionSQL s;
	Sancion sanciones[]=null;
	public ControlSancion(){
		leerSanciones();
		try {
			s=new SancionSQL();
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
	public void sancionPagada(Sancion san){
		
		try {
			s.pagado(san.getId());
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
	public void restarPuntos(Sancion san){
		try {
			s.actualizarPuntos(san.getDniConductor());
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
	public void leerSanciones(){
		try {
			for(int i=0;i<s.n_sanciones();i++){
				sanciones[i]=s.leer_sancion(i+1);
			}
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
	}
}
