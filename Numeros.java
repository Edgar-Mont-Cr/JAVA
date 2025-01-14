package Primeroparte;
import javax.swing.JOptionPane;
public class Numeros {
     public void par1(){
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
