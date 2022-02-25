package tiendaDeporte;
/**
 * <H2>CREACION CLASE PROVEEDOR<H2>
 * @author BYJOSEGRC
 * @version 0.1
 */

public class Proveedor extends Persona {

	/**
	 * <H2>ATRIBUTOS<H2>
	 * @author BYJOSEGRC
	 * @version 0.1
	 */
	
	String nombreProveedor;
	String apellido1;
	String apellido2;
	
	
	
	/**
	 * <H2>CONSTRUCTOR<H2>
	 * @author BYJOSEGRC
	 * @version 0.1
	 */
	
	public Proveedor(String nombreProveedor,String apellido1, String apellido2){
		this.nombreProveedor=nombreProveedor;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
	}
	
	/**
	 * <H2Funcion_dar_alta_a_Proveedor<H2>
	 * @author BYJOSEGRC
	 * @return nuevoProveedor
	 * @version 0.1
	 */
	public Proveedor alta() {
		
	Proveedor nuevoProveedor = new Proveedor("Pepe","Gomez","Perez");
		return nuevoProveedor;
		
	}
	
	/**
	 * <H2GET nombreProveedor<H2>
	 * @author BYJOSEGRC
	 * @return nombreProveedor
	 * @version 0.1
	 */
	public String getNombreProveedor() {
        return nombreProveedor;
    }
	
	/**
	 * <H2GET nombreProveedor<H2>
	 * @author BYJOSEGRC
	 * @return apellido1
	 * @version 0.1
	 */
	
	public String getApellido1() {
        return apellido1;
    }
	
	/**
	 * <H2GET nombreProveedor<H2>
	 * @author BYJOSEGRC
	 * @return apellido2
	 * @version 0.1
	 */
	public String getApellido2() {
        return apellido2;
    }
	

}
