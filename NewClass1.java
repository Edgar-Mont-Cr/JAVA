/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class NewClass1 {
    public static void main(String[] args) {
        int edad=0;
        long año_Ac=2024;
        
        long ano_na=Long.parseLong(JOptionPane.showInputDialog(null,"ingresa tu año de nacimiento"));
        edad=(int)(año_Ac-ano_na);
        JOptionPane.showMessageDialog(null,"tu edad es " + edad);
    }
}
