/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;

/**
 *
 * @author Edgar
 */
public class Ejercicio13 {
    public static void main(String[] arge) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un valor")) ;
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el segundo valer")) ;
        int num3 = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el tercer valor")) ;
    
        
        if (num2 == num1) {
            if (num3 == num2)
                System.out.println(num1 + " " + num2+ " " + "" + num3) ;
            else {
                if (num1 > num3)
                    System.out.println(num1 + " " + num2 + " " + "" + num3);
                else 
                    System.out.println(num3 + " " + num1 + " " + "" + num3);
        }
        }
        else {
                if (num1 > num3) {
                    if (num1 > num3)
                        if (num2 > num3) 
                            System.out.println(num1 + " " + num2+ " " + "" + num3);
                        else 
                            System.out.println(num1 + " " + num2+ " " + "" + num3);
                        }
                else {
                    System.out.println(num3 + " " + num1 + " " + "" + num2); 
                }
                }
        if (num2 > num1){
            if (num2 > num3){
                if (num1 > num3){
                    System.out.println(num2 + " " + num1 + " " + "" + num3);
                }
                else{
                    System.out.println(num2 + " " + num3 + " " + "" + num1);
                }
            }
            else {
                System.out.println(num3 + " " + num2 + " " + "" + num1);
            }
        }
            
                }
        }
    

