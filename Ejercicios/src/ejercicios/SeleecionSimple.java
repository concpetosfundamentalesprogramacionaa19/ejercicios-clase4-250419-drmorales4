/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.Operacion;

/**
 *
 * @author drmorales4
 */
public class SeleecionSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        String miMensaje = Operacion.mensaje;
        
        
        int calificacion = 85;
        
        
        
        if (calificacion >= 85){
            System.out.printf("%s %d\n:", miMensaje, calificacion);
          
        }
        int calificacion_2 = 45;
              
        if (calificacion_2 >=85){
            System.out.printf("Usted esta aprobado con %d\n:", calificacion_2);
        }

    }
    
}
