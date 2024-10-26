/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 import javax.swing.JOptionPane;
/**
 *
 * @author edgar
 */
public class PRIMER_PROGRAMA {
    public static void main(String[] args){
        final short FECHA_ACTUAL=2024;
        byte edad;
        short anioN = Short.parseShort(JOptionPane.showInputDialog(null,"Ingresa tu año de nacimiento"));
        edad = (byte)(FECHA_ACTUAL-anioN);
                
        JOptionPane.showMessageDialog(null,"tue edad es de: "+ edad);
        
    }
    
            
    
}
