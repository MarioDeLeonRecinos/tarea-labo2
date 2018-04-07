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
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private static Menu menu;
    public static ListaProducto product = new ListaProducto();
    
    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
        
    }
    public void add(String nombre,String proveedor,String telefono,int cantidad){
        product.add2(nombre,proveedor, telefono,cantidad);

    }

    public void opciones() {
        System.out.println("----- Menu -----");
        System.out.println("1. Agregar  producto y proveedor.");
        System.out.println("2. Mostrar productos.");
        System.out.println("3. Borrar");
        System.out.println("4. Agregar al producto en base.");
        System.out.println("5. Extraer del producto. ");
        System.out.println("6. Salir");
    }
    public void opciones2() {
        System.out.println("----- Login -----");
        System.out.println("user");
        System.out.println("password");

    }
    public void mostrar() {
        int opcion = 100;
        Scanner leer = new Scanner(System.in);
        

        while (opcion != 6) {
            opciones();
            try {
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        product.add1();
                        break;
                    case 2:
                        product.mostrar();
                        break;
                    case 3:
                        menu.borrar();
                        break;
                    case 4:
                        menu.agregar();
                        break;
                    case 5:
                        menu.descartar();
                        break;
                    case 6:
                        System.out.println("Adios :(");
                        break;
                    default:
                        System.out.println("Por favor ingrese una opcion valida");
                }
            } catch (InputMismatchException e) {
                System.err.println("Por favor, Ingrese un número");
                leer.nextLine();
            }
        }
    }
    public void login(){
        boolean salida=true;
        String pass2;
        String user2;
        Scanner user = new Scanner(System.in);
        while (salida == true) {
            opciones2();
            try {
                user2 = user.nextLine();
                pass2 = user.nextLine();

                if(user2.equals("admin")&& pass2.equals("Laito")){
                    salida=false;
                }
            }catch (InputMismatchException f) {
                System.err.println("Por favor ingrese algo valido");
                user.nextLine();
            }
        }
    }

    
    public void borrar(){
        String nombre;
        Scanner leer = new Scanner(System.in);
        nombre=leer.nextLine();
        product.borrar(nombre);
    }
    public void agregar(){
        String nombre;
        int cantidad;
        Scanner leer = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("Nombre del producto.");
        nombre = leer.nextLine();
        System.out.println("Cantidad a agregar.");
        cantidad = num.nextInt();
        product.agregarE(nombre,cantidad);
    }
    
    public void descartar(){
        String nombre;
        int cantidad;
        Scanner leer = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        System.out.println("Nombre del producto.");
        nombre = leer.nextLine();
        System.out.println("Cantidad a eliminar.");
        cantidad = num.nextInt();
        product.descartarE(nombre,cantidad);
    }
}

