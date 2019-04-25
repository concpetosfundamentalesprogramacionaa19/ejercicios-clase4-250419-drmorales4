/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import paquetedos.OperacionDos;

/**
 *
 * @author drmorales4
 */
public class SeleccionAnidada {
    public static void main (String [] args){
        
        String miMensaje1 = OperacionDos.mensaje1;
        String miMensaje2 = OperacionDos.mensaje2;
        String miMensaje3 = OperacionDos.mensaje3;
        String miMensaje4 = OperacionDos.mensaje4;
        
        int calificacion = 50;
        if (calificacion >= 90){
            System.out.printf("%s %d\n", miMensaje1, calificacion);
        }else{
            if (calificacion < 90 && calificacion >- 80){
                System.out.printf("%s %d\n", miMensaje2, calificacion);
            }else{
                if (calificacion < 80 && calificacion >= 50){
                    System.out.printf("%s %d\n", miMensaje3, calificacion);
                }else{
                    System.out.printf("%s %d\n", miMensaje4, calificacion);
                }
            }
        }
    }
    
}
