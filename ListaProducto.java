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

import java.util.ArrayList;
import java.util.Scanner;


public class ListaProducto {
    private ArrayList<Producto> listProducto;
    ArrayList<Producto> temporal;
    
    public ListaProducto() {
        listProducto = new ArrayList<>();
        temporal = new ArrayList<>();
    }
    
    public void add1() {
        Producto product = new Producto();
        
        listProducto.add(product);
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto: ");
        product.setNombres(leer.nextLine());
        
        System.out.println("Ingrese el nombre del proveedor: ");
        product.setProveedor(leer.nextLine());
        
        System.out.println("Ingrese el telefono del proveedor");
        product.setTelefono(leer.next());
        
        System.out.println("Ingrese la cantidad");
        System.out.print(": ");
        product.setCantidad(leer.nextInt());
        
    }
    
    public void add2(String nombre,String proveedor,String telefono, int cantidad) {
        Producto product = new Producto();
        
        listProducto.add(product);
        
        product.setNombres(nombre);
        
        product.setProveedor(proveedor);
        
        product.setTelefono(telefono);
        
        product.setCantidad(cantidad);
    }
    
    public void add3(String nombre,String producto,String telefono,int cantidad) {
        Producto product = new Producto();
        
        temporal.add(product);
        
        product.setNombres(nombre);
        
        product.setProveedor(producto);
        
        product.setTelefono(telefono);
        
        product.setCantidad(cantidad);
        
    }
    
    public void add(Producto product) throws Exception{
        if(product != null) {
            if (!listProducto.contains(product)) {
                listProducto.add(product);
            }
            Exception e = new Exception("No se permiten datos duplicados");
            throw e;
        } else {
            throw new Exception("No se puede agregar un estudiante nulo");
        }
        
    }
    
    public void mostrar() {
        for ( Producto e : listProducto) {
            System.out.println(e.toString());
        }
    }
    
    public int size(){
        return listProducto.size();
    }
    
    public void borrar(String nombre){
        for (Producto e : listProducto){
            if(nombre.equals(e.getNombres())){
            }
            else{
                add3(e.getNombres(),e.getProveedor(),e.getTelefono(),e.getCantidad());
            }
        }
        listProducto=null;
        listProducto=temporal;
        temporal=new ArrayList<>();
    }
    
    public void agregarE(String nombre,int cantidad){
        
        for (Producto e : listProducto){
            if(nombre.equals(e.getNombres())){
                e.setCantidad(e.getCantidad()+cantidad);
            }
        }
    }
    public void descartarE(String nombre,int cantidad){
        
        for (Producto e : listProducto){
            if(nombre.equals(e.getNombres())){
                e.setCantidad(e.getCantidad()- cantidad);
            }
        }
    }
}
