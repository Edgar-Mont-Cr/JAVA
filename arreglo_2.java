/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class arreglo_2 {
    public static void main(String[] args) {
        //declaracio de variables
        String materias[]={"CalcDif","MateDis","FundPro","FundInv","Quimica","DesSust"};
        String encabezado[]={"MAteria","U1","U2","U3","U4","U5"};
        byte calificaciones[][]=new byte [6][5];
        byte x,y;
        
        //Filas
        for (x = 0; x < 5; x++) {
            for (y = 0; y < 5; y++) {
                calificaciones[x][y]=Byte.parseByte(JOptionPane.showInputDialog(null,"ingresa calificaciones de " + materias[x]+ " unidad " +(y+1)));
            }
        }
        
        //impresion de calificaciones
        for (int k = 0; k < 6; k++) {
            System.out.print(encabezado[k]+"\t");
        }
        System.out.println();
        for (byte i = 0; i < 5; i++) {//filas
            System.out.print(materias[i] + "\t");
            for (byte j = 0; j < 5; j++) {
                System.out.print(calificaciones[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
