

package org.IT1_aperturaExpediente.Persistencia;
/*               //////////////////  Control de Versiones en Agente.java  //////////
 * 
 * Version 1.1.0 Se ha añadido un metodo leerGeneral() para poder hacer lecturas a la base de datos de cualquier tabla
 * Version 1.1.1 Se ha corregido un error en el metodo leerGeneral()
 * 
 * 
 * 
 * 
 * 
 */
import java.sql.*;
import java.util.ArrayList;

public class Agente {

	//instancia del agente
    protected static Agente mInstancia=null;
    //Conexion con la base de datos
    protected static Connection mBD;
	//Identificador ODBC de la base de datos
    private static String url="jdbc:mysql://localhost:3306/DGT";
    //Driven para conectar con bases de datos MySQL 
    private static String driver="com.mysql.jdbc.Driver";
    
    public Agente() throws Exception{
		conectar();
	} 
	public static Agente getAgente() throws Exception{
          if (mInstancia==null){
          mInstancia=new Agente();
        }
        return mInstancia;
     }
	  private void conectar() throws Exception {
	         Class.forName(driver);
	         mBD=DriverManager.getConnection(url,"root","");
	    }
	public void desconectar() throws Exception{
	    	mBD.close();
	    }
    public int insert(String SQL) throws SQLException, Exception{ 
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    //Metodo para realizar una eliminacion en la base de datos
    public int delete(String SQL) throws SQLException,Exception{
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    
    //Metodo para realizar una eliminacion en la base de datos
    public int update(String SQL) throws SQLException,Exception{
    	conectar();
    	PreparedStatement stmt = mBD.prepareStatement(SQL);
    	int res=stmt.executeUpdate();
    	stmt.close();
    	desconectar();
    	return res;
    }
    public ArrayList<Object> leerGeneral(String cadena,int n) throws Exception{
    	conectar();
		Statement s;
		ArrayList<Object> lista=new ArrayList<Object>();
			s = mBD.createStatement();
			int i=1;
			ResultSet rs = s.executeQuery(cadena);
			while (rs.next()){
				lista.add(rs.getInt(i));
				i++;
			}
			desconectar();
			return lista;
    	
    }
	public int leer(String cadena) throws Exception {
		conectar();
		Statement s;
		int entero=0;
			s = mBD.createStatement();
	
			ResultSet rs = s.executeQuery (cadena);
			while (rs.next()){
				entero=rs.getInt(1);
			
			}
			desconectar();
		return entero;	
	}
}
