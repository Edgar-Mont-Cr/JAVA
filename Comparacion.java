/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class Comparacion {
    public static void main(String[] args){
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa tu primer valor"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa tu segundo valor"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa tu tercer valor"));
        
        if (a > b && a > c){
            System.out.println(a + " es el mayor");
        }
        else{
            if (b > a && b > c){
                    System.out.println(b + " es el mayor");
                }
            else{
                System.out.println(c + " es el mayor");
            }
        
    }
    }
    
}
