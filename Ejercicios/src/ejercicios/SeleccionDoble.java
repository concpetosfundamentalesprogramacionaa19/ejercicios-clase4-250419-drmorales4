/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import paquetedos.Operacion;

/**
 *
 * @author drmorales4
 */
public class SeleccionDoble {
    public static void main (String [] args){
        // documentacion
        
         String miMensaje = Operacion.mensaje;
         String miMensaje2 = Operacion.mensaje2;
         
        int calificacion = 85;
        
        if (calificacion >= 85){
            System.out.printf("%s %d\n:", miMensaje, calificacion); // SI, entonces
            
        }else { // "si no"
            System.out.printf("%s %d\n:", miMensaje2, calificacion);
        }
        int calificacion_2 = 45;
        
        if (calificacion_2 >= 85){
            System.out.printf("%s %d\n:", miMensaje, calificacion_2);
            
        }else {
            System.out.printf("Usted esta reprobado con %d\n", calificacion_2);
            System.out.printf("%s %d\n:", miMensaje2, calificacion_2);
        }
        
    }
    
}
