package Primeroparte;

import javax.swing.JOptionPane;
public class Arreglo {
    public void par14() {
        String materias[]={"CALCULO","FUNDAIN","QUIMICA","DESASUS","MATEDIS","FUNDPRO","TUTORIA"};
        String encabezado[]={"MATERIA","U1","U2","U3","U4","U5","PROMEDIO"};
        int[][] tipo = new int[7][5]; 
        int promt;
        int con=0;
        
        
        for (int m = 0; m < encabezado.length; m++) {
            System.out.print(encabezado[m] + "\t\t");
        }
        System.out.println();
        for (int i = 0; i < materias.length; i++) {
            System.out.print(materias[i]);
            byte R=0;
            promt=0;
            for (int j = 0; j < 5; j++) {
                R=(byte)(R+1);
                tipo[i][j]=Integer.parseInt(JOptionPane.showInputDialog
                    (null, "INGRESA TU CALIFICACION DE " + materias[i] + " DE LA U" + R));
                System.out.print("\t\t"+tipo[i][j]);
                promt += tipo[i][j];
            }
            promt=(int)(promt/5);
            con += promt;
            System.out.print("\t\t" + promt);
            System.out.println();
        }
        con=con/7;
        System.out.println("TU PROMEDIO TOTAL ES DE " + con);
    }
    
}
