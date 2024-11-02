/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class RadiYVolumen {
     public static void main(String[] args){
        int R = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor del radio"));
        int H = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor de la altura"));
        
        double volumen;
        double area;
        volumen = (double)(Math.PI * (Math.pow(R, 2) * H));
        area = (double)(2*Math.PI * R * H);
        System.out.println("el area es " + area + " y el volumen es de " + volumen );
    }
    
}
