/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class PAR_E_IMPAR {
    public static void main(String[] args) {
        byte resu;
        short ast;
        byte k=0;
        do {
            int num=Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA EL NUMERO QUE SE DESEA SABER"));
            resu=(byte)(num%2);
            if (resu==0) {
                System.out.println("EL NUMERO ES PAR");
                ast=(short)(num/2);
                for (short i = 1; i<= ast; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                System.out.println("EL NUMERO ES IMPAR");
            }
            k++;
        } while (k<=10);
    }
}
