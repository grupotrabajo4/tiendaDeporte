/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendadeportegrupo;

/**
 **<H2>Clase cliente que hereda de la clase Empleado</H2>
 * @author dinam
 * @param enum para enumerar tipos de empleado
 */
public class Cliente 
{
    public class Cliente implements Empleado 
    {
    //atributos
    private String nombre;
    private String apellido;
    private String nacimiento;
    private String dni;
    private enum tipoEmpleado { POTENCIAL, NUEVO, VIP, MOROSO };
    
    //constructor
    public Cliente(enum tipoEmpleado)
    {
        this.tipoEmpleado=tipoEmpleado;
    }
    
    /**
     * <H2>Método para dar de alta a nuevos clientes</H2>
     * @author dinam
     * @param dni del cliente tipo String ya que es alfanumerico
     * @return String creado donde sale los datos de alta de un cliente
    */
    

    public static String Alta()
    {
        System.out.println("Introduce el nombre: ")
        String nombre = pedirDatos.nextLine();
        System.out.println("Introduce el apellido: ")
        String apellido = pedirDatos.nextLine();
        System.out.println("Introduce lugar de nacimiento: ")
        String nacimiento = pedirDatos.nextLine();
        System.out.println("Introduce el dni: ")
        String dni = pedirDatos.nextLine();
        
        return "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' +
                ", lugar de nacimiento=" + nacimiento +  '\'' +
                ", dni=" + dni:
    }
}

    
}
