package tiendaDeporte;

import java.util.ArrayList;
import java.util.Scanner;

/**

 * <H2>Clase Principal</H2>

 * Crea una lista de clientes, proveedores y artículos y los muestra por pantalla.

 *

 * @author Lagartijo676

 * @version 0.1

 */
public class Principal {
    

    static Scanner escaner = new Scanner(System.in);
    
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Articulo> articulos = new ArrayList<Articulo>();
    static ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    
    /**

     * <H2>Método introducirClientes</H2>

     * Introduce clientes en la lista de clientes

     * @param n número de clientes a introducir

     */
    public static void introducirClientes(int n){
        for(int i=0;i<n;i++){
            System.out.println("Vamos a introducir " + n + " clientes:");
            System.out.println("Introduce el nombre del cliente " + (i+1) + ":");
            clientes.add(new Cliente(escaner.nextLine()));
        }
    }

 	/**

     * <H2>Método introducirProveedores</H2>

     * Introduce proveedores en la lista de proveedores

     * @param n número de proveedores a introducir

     */
    public static void introducirProveedores(int n){
        for(int i=0;i<n;i++){
            System.out.println("Vamos a introducir " + n + " proveedores:");
            System.out.println("Introduce el nombre del proveedor " + (i+1) + ":");
            String nombre = escaner.nextLine();
            System.out.println("Introduce el primer apellido del proveedor " + (i+1) + ":");
            String apellido1 = escaner.nextLine();
            System.out.println("Introduce el segundo apellido del proveedor " + (i+1) + ":");
            String apellido2 = escaner.nextLine();
            proveedores.add(new Proveedor(nombre, apellido1, apellido2));
        }
    }
    
    /**

     * <H2>Método introducirArticulos</H2>

     * Introduce artículos en la lista de artículos

     * @param n número de artículos a introducir

     */
    public static void introducirArticulos(int n){
        for(int i=0;i<n;i++){
            System.out.println("Vamos a introducir " + n + " articulos:");
            System.out.println("Introduce el nombre del articulo " + (i+1) + ":");
            String nombre = escaner.nextLine();
            System.out.println("Introduce el precio del articulo " + (i+1) + ":");
            double precio = escaner.nextDouble();
            escaner.nextLine();
            System.out.println("Introduce la descripción del articulo " + (i+1) + ":");
            String descripcion = escaner.nextLine();
            articulos.add(new Articulo(nombre, precio, descripcion));
        }
    }
    
    /**

     * <H2>Método main</H2>

     * Introduce los clientes, proveedores y artículos en sus listas correspondientes y los muestra por pantalla.

     */
    public static void main(String[] args){
        
        introducirClientes(4);
        
        introducirProveedores(3);
        
        introducirArticulos(2);
        
        
        System.out.println("Lista de clientes: ");
        for(int i=0;i<clientes.size();i++) {
        	System.out.print(clientes.get(i).getNombre());
        }
        
        System.out.println("Lista de proveedores: ");
        for(int i=0;i<articulos.size();i++) {
        	System.out.print(proveedores.get(i).getNombreProveedor());
        }
        
        System.out.println("Lista de articulos: ");
        for(int i=0;i<articulos.size();i++) {
        	System.out.print(articulos.get(i).getCodigo());
        }
    }
}
