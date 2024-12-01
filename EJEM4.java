/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class EJEM4 {
    public static void main(String[] args) {
        byte x=1;
        short resultado=1;
        do {
            resultado*=x;
            x++;
        } while (true);
        JOptionPane.showMessageDialog(null,"el resultado es " + resultado);
    }
}
