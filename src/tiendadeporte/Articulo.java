/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadeporte;

/**
 *
 * @author Usuario
 */
public class Articulo {
    
    String codigo;
    double precio;
    String descripcion;
    
    public Articulo(String codigo, double precio, String descripcion)
    {
    this.codigo=codigo;
    this.precio=precio;
    this.descripcion=descripcion;
    }
    
    public Articulo alta()
    {
     Articulo nuevo = new Articulo("cartera",21,"es de cuero");
     return nuevo;
    }
    public void visualizarDatos()
    {
    System.out.println("este es un nuevo articulo"+alta());
    }
}
