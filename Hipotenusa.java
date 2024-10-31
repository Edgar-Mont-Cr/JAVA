/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class Hipotenusa {
    public static void main(String[] args){
        int CatA = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la medida del cateto A"));
        int CatB = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa la medida del cateto B"));
        
        double Hipotenusa;
        
        Hipotenusa = (double)(Math.sqrt(CatA + CatB));
        
        System.out.println("el valor de la hipotenusa es: " + Hipotenusa);
    }
    
}
