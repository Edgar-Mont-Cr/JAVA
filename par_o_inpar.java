/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class par_o_inpar {
    public static void main(String[] args){
        int N = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un numero"));
        if (N % 2 == 0){
            System.out.println("el numero es par") ;
        }
        else{
            System.out.println("el numero es inpar");
        }
    }
}

