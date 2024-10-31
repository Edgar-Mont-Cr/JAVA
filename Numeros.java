/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class Numeros {
     public static void main(String[] args){
    int a = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un valor"));
    int b = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa tu segundo valor"));
    
    if (a == b){
        System.out.println("los valores son iguales");
    }
    else {
        if (a > b){
            System.out.println(a + " es el mayor");
        }
        else {
            System.out.println(b + " es el mayor");
            }
        }
    }
    
}
