/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.labo2;

/**
 *
 * @author mcdre
 */

import java.util.Objects;

public class Producto {
    private String nombres, proveedor, telefono;
    int cantidad;
    public Producto() {}

    public Producto(String nombres, String proveedor){
        this.nombres =  nombres;
        this.proveedor =  proveedor;
    }

    public Producto(String nombres, String proveedor, String telefono,int cantidad) {
        this.nombres = nombres;
        this.proveedor = proveedor;
        this.telefono = telefono;
        this.cantidad = cantidad;
    }
    
    public String getNombres(){
        return nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String apellidos) {
        this.proveedor = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String carnet) {
        this.telefono = carnet;
    }
    
    public int getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombres + ", proveedor=" + proveedor + ", telefono=" + telefono + ", cantidad=" + cantidad + '}';
    }

    
    public static void main(String ... args) {

        Menu menu = Menu.getInstance();
        menu.login();
        menu.add("Churrito", "Diana", "2255-9475",50);
        menu.add("Cerecitas", "Diana", "2255-9475",40);
        menu.add("Doritos", "Lays", "2257-7777",35);
        menu.mostrar();
        
    }
   
}
