package org.IT2_sancionConductor.Dominio;
/*				Gestion de Configuración
 *  
 * class Sancion version 1.0.1 -> Ya que hacia falta un atributo id
 * 
 * Sancion v 1.1.0 Se han añadido metodos set y get para las variables.
 * Sancion v 1.1.1 Se han puesto algunas variables como privadas ya que estaban como publicas.
 */
import org.IT1_aperturaExpediente.Dominio.*;

public class Sancion {

	private int id;
	private Expediente exp;
	private int dniConductor;
	private boolean pagado;
	private int puntos;
	private int importePagar;
	
	public Sancion(Expediente exp,String nombre){
		this.exp=exp;
		dniConductor=leerDNI(nombre);
		pagado=false;
		puntos=calcularPuntos(exp);
		importePagar=calcularImporte(exp);
	}
	private int calcularImporte(Expediente exp2) {
		// TODO Apéndice de método generado automáticamente
		return 0;
	}
	private int calcularPuntos(Expediente exp2) {

		return 0;
	}
	private int leerDNI(String nombre) {

		return 0;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Expediente getExp() {
		return exp;
	}
	public void setExp(Expediente exp) {
		this.exp = exp;
	}
	public int getDniConductor() {
		return dniConductor;
	}
	public void setDniConductor(int dniConductor) {
		this.dniConductor = dniConductor;
	}
	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	public int getImportePagar() {
		return importePagar;
	}
	public void setImportePagar(int importePagar) {
		this.importePagar = importePagar;
	}

}
