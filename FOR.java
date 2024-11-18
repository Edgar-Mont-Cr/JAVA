/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class FOR {
    public static void main(String[] args) {
        int peso ;
        int num = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa cuantas veces vas a hacer el registro"));
        float estatura, imc;
        int resp= 0;
        for (resp = 0; resp < num; resp++) {
            peso = Integer.parseInt(JOptionPane.showInputDialog("captura tu peso"));
            estatura = Float.parseFloat(JOptionPane.showInputDialog("captura tu estatura con formato de metros"));
            imc = (peso/(estatura*estatura));
            if (imc<18.29){
                JOptionPane.showMessageDialog(null,"peso bajo");
            }
            else if (imc>=18.50 && imc <= 24.99){
                JOptionPane.showMessageDialog(null, "peso normal");
            }
            else if (imc>=25 && imc <=29.99){
                JOptionPane.showMessageDialog(null,"sobrepeso");
            }
            else if (imc>=30 && imc<=34.99){
                JOptionPane.showMessageDialog(null,"obesidad leve");
            }
            else if (imc>=35 && imc<=39.99){
                JOptionPane.showMessageDialog(null,"obesidad media");
            }
            else {
                JOptionPane.showMessageDialog(null,"obesidad morbida");
            }
        }
    }
    
}

