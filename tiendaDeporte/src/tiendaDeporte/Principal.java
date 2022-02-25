
package tiendadeporte;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Principal {
    
    static Scanner escaner = new Scanner(System.in);
    
    static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    static ArrayList<Articulo> articulos = new ArrayList<Articulo>();
    static ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
    
    public static void introducirClientes(int n){
        for(int i=0;i<n;i++){
            System.out.println("Vamos a introducir " + n + " clientes:");
            System.out.println("Introduce el nombre del cliente " + (i+1) + ":");
            clientes.add(new Cliente(escaner.nextLine()));
        }
    }
    
    public static void introducirProveedores(int n){
        for(int i=0;i<n;i++){
            System.out.println("Vamos a introducir " + n + " proveedores:");
            System.out.println("Introduce el nombre del proveedor " + (i+1) + ":");
            proveedores.add(new Proveedor(escaner.nextLine()));
        }
    }
    
    public static void introducirArticulos(int n){
        for(int i=0;i<n;i++){
            System.out.println("Vamos a introducir " + n + " articulos:");
            System.out.println("Introduce el nombre del articulo " + (i+1) + ":");
            articulos.add(new Articulo(escaner.nextLine()));
        }
    }
    
    public static void main(String[] args){
        
        introducirClientes(4);
        
        introducirProveedores(3);
        
        introducirArticulos(2);
        
        System.out.println("Lista de clientes: " + clientes);
        
        System.out.println("Lista de proveedores: " + proveedores);
        
        System.out.println("Lista de articulos: " + articulos);
    }
}
