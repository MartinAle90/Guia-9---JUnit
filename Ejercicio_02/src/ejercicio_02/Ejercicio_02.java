/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_02;

import Servicios.ServicioRazaPerro;

/**
 *
 * @author Martin
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    
//    . Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.
    
    public static void main(String[] args) {
   
        ServicioRazaPerro srp = new ServicioRazaPerro();
        
        srp.agregarRaza();
        srp.mostrarRazas();
        srp.eliminiarRaza();
        srp.mostrarRazas();
    }    
    
    
}
