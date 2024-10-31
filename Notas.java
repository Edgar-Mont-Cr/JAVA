/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class Notas {
    public static void main(String[] args){
        char nuevaNota = 'A';
        byte Nota = Byte.parseByte(JOptionPane.showInputDialog(null,"ingrese la calificacion"));
        
        if (Nota>=19 && Nota<= 20){
            nuevaNota = 'A';
            }
        else if (Nota>=16 && Nota<=19){
                nuevaNota = 'B';
                }
        else if (Nota>=13 && Nota<=15){
                nuevaNota = 'C';
                }
        else if (Nota>=10 && Nota<=12){
                nuevaNota = 'D';
                }
        else if (Nota>=1 && Nota<=9){
                nuevaNota = 'E';
                }
        else {
            JOptionPane.showMessageDialog(null,"el valor ingresado no es valido");
             }
        JOptionPane.showMessageDialog(null,"la calificacion es de: " + Nota + " y la nota a obtener es de: " + nuevaNota);
        
             }
        }
        
        
    

               
            
        
