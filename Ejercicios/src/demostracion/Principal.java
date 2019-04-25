/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;

import java.util.Scanner;

/**
 *
 * @author drmorales4
 */
public class Principal {
    public static void main (String [] args){
        
        double mensajes; 
        double pormensaje;
        double tarifabasica; 
        double iva;
        double costoPagar;
        double mensajes2;
        double mensajes3, mensajes4;// variables
        
        tarifabasica = 0;
       Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de mensajes:"); // ingresando numero de mensajes
        mensajes = entrada.nextDouble();
        
        if (mensajes <= 40){ // si mensaje es <= 40
            tarifabasica = 3;
        }else{
            if (mensajes > 40 && mensajes <= 200){ // si mensaje es > 40 y < 200
                mensajes2 = mensajes - 40;
                pormensaje = mensajes2 * 0.05;
                tarifabasica = 3 + pormensaje;
                
            }else {
            if (mensajes > 200) {   // si mensaje es > 200
             mensajes3 = mensajes - 200; // resto los 200 mensajes 
             mensajes2 = mensajes3 - 40; // resto los 40 mensajes de los 200 ya q son equivalentes a $3
             mensajes4 = mensajes3 * 0.05; // multiplico esos 200 - 40 ya que <= 200 valen 0.05
             pormensaje = mensajes2 * 0.10; // multiplico los los sobrantes mas de 200 por 0.10
             tarifabasica = 3 + mensajes3 + pormensaje; // sumo las 3 cantidads, la tarifa base, los * 0.05 y los 0.10
         }
        }
       }
    iva = tarifabasica * 0.12;
    costoPagar = tarifabasica + iva;
    System.out.printf("La tarifa a pagar por los mensajes incluido iva es de:"
            + " $ %.3f", costoPagar);
    
    // Ing. El problema es del repositorio, ya que corte la carpeta en el escritorio y vuelvo abrir y corre normlamente sin salir ese error
}
}