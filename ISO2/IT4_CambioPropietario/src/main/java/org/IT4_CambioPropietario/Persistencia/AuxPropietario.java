package org.IT4_CambioPropietario.Persistencia;

import java.sql.SQLException;
import org.IT1_aperturaExpediente.Persistencia.Agente;
public class AuxPropietario {
	private Agente a;
	public AuxPropietario() throws Exception{
		a=new Agente();
	}
	public void cambiarPropietario(int dni) throws SQLException, Exception{
		String cadena="UPDATE  Vehiculos SET Id_persona='"+dni+"';";
		a.update(cadena);
	}
}
