/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class COLOR {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"BIENVENIDO A LA CAFETERIA");
        int cost = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA EL COSTO TOTAL DE LO COMPRADO"));
        short pagar;
        JOptionPane.showMessageDialog(null,"""
                                           HAY UN CONCURSO EN DONDE SE TE DECONTARA CONFORME A LO QUE SAQUES
                                           LA PELOTA ROJA VALE EL 40%
                                           LA PELOTA VERDE VALE EL 28%
                                           LA PELOTA AZUL VALE 15%
                                           LA PELOTA AMARILLA 5%
                                           """);
          int n = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA UN NUMERO DEL 1 A 10"));
        if (n == 3){
            pagar = (short)((cost*0.4)-cost);
            JOptionPane.showMessageDialog(null,"FELICIDADES VAS A APAGAR $" + pagar);
        }
        else if (n == 5){
            pagar = (short)(cost-(cost*0.28));
            JOptionPane.showMessageDialog(null,"GENIAL VAS A PAGAR $" + pagar);
        }
        else if (n == 8){
            pagar = (short)(cost-(cost*0.15));
            JOptionPane.showMessageDialog(null,"BUENA MANO VAS A PAGAR $" + pagar);
        }
        else if (n ==4){
            pagar = (short)(cost-(cost*0.05));
            JOptionPane.showMessageDialog(null,"MAS SUERTE LA PROCIMA VAS A PAGAR $" + pagar);
        }
        else {
            JOptionPane.showMessageDialog(null,"LO SIENTO SIQUE PARTICIPANDO");
            JOptionPane.showMessageDialog(null,"TENDRAS QUE PAGAR $" + cost);
        }
    }
    
}
