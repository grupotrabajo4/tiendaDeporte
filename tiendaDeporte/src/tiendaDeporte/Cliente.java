/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaDeporte;

/**
 **<H2>Clase cliente que hereda de la clase Empleado</H2>
 * @author dinam
 */
public class Cliente implements Empleado {
    //atributos
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String dni;
    private enum tipoEmpleado { POTENCIAL, NUEVO, VIP, MOROSO };

    //constructor
    public Cliente (String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * <H2>Método para dar de alta a nuevos clientes</H2>
     * @author dinam
     * @param dni del cliente tipo String ya que es alfanumerico
     * @return String creado donde sale los datos de alta de un cliente
    */

    
    public static String Alta(String nombre, String apellido, String nacimiento, String dni)
    {
            return "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' +
                    ", lugar de nacimiento=" + nacimiento +  '\'' +
                    ", dni=" + dni;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
    return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String getNacimiento() {
    return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public String getDni() {
    return dni;
    }

    public void setDni(String dni) {
    this.dni = dni;
    }
}