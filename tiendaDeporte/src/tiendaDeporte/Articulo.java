/**
*<h2> clase articulo </h2>
 * Esta clase crea un nuevo articulo y visualiza los datos del articulo
 * @author: Sergio Garcia Rubio
 * @version: 25/02/2022
 */
package tiendaDeporte;

public class Articulo {
    
    String codigo;
    double precio;
    String descripcion;
    
 /**
  * <h2>contructor del articulo</h2>
 * Este es el constructor de la clase
 * @author: Sergio García Rubio
 * @version: 25/02/2022
 */
    public Articulo(String codigo, double precio, String descripcion)
    {
    this.codigo=codigo;
    this.precio=precio;
    this.descripcion=descripcion;
    }
    
    /**
     * <h2>metodo alta</h2>
 * Este metodo crea un nuevo articulo
 * @author: Sergio García Rubio
 * @version: 25/02/2022
 */
    public Articulo alta()
    {
     Articulo nuevo = new Articulo("cartera",21,"es de cuero");
     return nuevo;
    }
    /**
     * <h2>Metodo visualizarDatos</h2>
 * Este metodo muestra los datos del articulo
 * @author: Sergio García Rubio
 * @version: 25/02/2022
 */
    public void visualizarDatos()
    {
    System.out.println("El codigo es"+codigo+" con precio "+precio+" descripción: "+descripcion);
    }
    
      /**
     * <h2>Metodos get y set</h2>
 * Este metodo muestra los datos del articulo
 * @author: Sergio García Rubio
 * @version: 25/02/2022
 */
    public String getCodigo(){return codigo;}
    public double getPrecio(){return precio;}
    public String getDescripcion(){return descripcion;}

    public void setCodigo(String codigo){this.codigo=codigo;}
    public void setPrecio(double precio){this.precio=precio;}
    public void serDescripcion(String descripcion){this.descripcion=descripcion;}
}