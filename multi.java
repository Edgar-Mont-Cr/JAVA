/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class multi {
    public static void main(String[] edgar) {
        //declaracion de variables
        byte ta1[][]=new byte [3][3];
        byte ta2[][]=new byte [3][3];
        
        //ingresion de datos
        for (byte i = 0; i < ta1.length; i++) {
            for (int j = 0; j < ta1.length; j++) {
                ta1[i][j]=Byte.parseByte(JOptionPane.showInputDialog(null,"ingresa tu numero de la tabla 1"));
            }
            for (int l = 0; l < ta2.length; l++) {
                ta2[i][l]=Byte.parseByte(JOptionPane.showInputDialog(null,"ingresa tu numero de la tabal 2"));
            }
        }
        
        //impresion de valores
        for (int i = 0; i < ta1.length; i++) {
            for (int j = 0; j < ta1.length; j++) {
                System.out.print(" | " + ta1[i][j] + " | ");
            }
            System.out.print("\t\t");
            for (int j = 0; j < ta2.length; j++) {
                System.out.print(" | " + ta2[i][j] + " | ");
            }
            System.out.println();
            System.out.print("------------------\t\t\t");
            System.out.print("------------------");
            System.out.println();
        }
        System.out.println();
    }
}    
        
        //multiplicacion de variables
       
    
