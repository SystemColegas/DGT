package org.IT1_aperturaExpediente.Persistencia;



public class Aux {
	
	private Agente agente=null;
	
	public Aux() throws Exception{
		agente=Agente.getAgente();
	}
	public int leerCocheAleatorio(int n) throws Exception{

		String cadena="SELECT Matricula FROM Vehiculos WHERE Id_vehiculo = '"+n+"';"; 
		return agente.leer(cadena);	
	}//Id_expediente, vehiculo, Velocidad, VelocidadMAX, LocalizacionRADAR
	public void insertarExpediente(int id,int matricula,int velocidad,int velMAX,String localizacion) throws  Exception{
		agente.insert("INSERT INTO Expedientes VALUES ('"+id+"','"+getIdCoche(matricula)+"','"+velocidad+"','"+velMAX+"','"+localizacion+"');");
	}
	private int getIdCoche(int matricula) throws Exception{
		String cadena="SELECT Id_Vehiculo FROM Vehiculos WHERE Matricula = '"+matricula+"';";
	
		return agente.leer(cadena);
		
	}

}
