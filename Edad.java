/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class Edad {
    public static void main(String[] args) {
        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog(null,"¿cual es tu edad?"));
        
        if (edad<2){
            JOptionPane.showInputDialog("eres un bebe");
        }
        else if (edad>2 && edad<18){
            JOptionPane.showInputDialog("eres un niño");
        }
        else if (edad>=18 && edad<30){
            JOptionPane.showInputDialog("eres un joven");
        }
        else if (edad>=30 && edad<50){
            JOptionPane.showInputDialog("eres un señor");
        }
        else if (edad>=50 && edad<60){
            JOptionPane.showInputDialog("eres un suegro(ra)");
        }
        else if (edad>=60 && edad>70){
            JOptionPane.showInputDialog("eres un abuelito(ta)");
        }
        else if (edad>=70){
            JOptionPane.showInputDialog("felicidades por tener una edad mayor que 70");
        }
    }
}
