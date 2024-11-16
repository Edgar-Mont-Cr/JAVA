/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aspire
 */
public class Tabla {
    public static void main(String[] args) {
        
        //Tablas 10                              
        byte multiplicacion, resultado;
        byte incre;
                    
        for (byte i = 1; i <= 10; i++) {                       
            incre = 1;
            System.out.println("Tabla del "+ i);
            while(incre <= 10){                  
                resultado =(byte) (i*incre);
                System.out.println(i +" * "+ incre + " = " + resultado);
                incre++;
            }                        
        }              
    }    
}
