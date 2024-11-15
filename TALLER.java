/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class TALLER {
    public static void main(String[] args){
        JOptionPane.showMessageDialog(null,"BIENBENIDO ESTUDIANTE DEL TECNOLIOGICO DE JILOTEPEC");
        JOptionPane.showMessageDialog(null,"EL GOBIENO DONO UN MONTO DE $189,000 PARA LAS ACTIVIDADES CULTURALES Y DEPORTIVAS");
        JOptionPane.showMessageDialog(null,"""
                                           LISTA DE TALLERES
                                           1------------------BASQUETBALL
                                           2------------------VOLEYBALL
                                           3------------------ARTES
                                           4------------------FUTBALL
                                           5------------------TAEKUANDO
                                           6------------------AJEDRES
                                           7------------------MUSICA
                                           8------------------ATLETISMO
                                           """);
        JOptionPane.showMessageDialog(null,"""
                                           EL MONTO DE CAS TALER ES 
                                           BASQUETBALL ES DE $9000
                                           VOLEYBALL ES DE $15000
                                           ARTES ES DE $50000
                                           FUTBALL ES DE $25000
                                           TAEKUANDO ES DE $50000
                                           AJEDRES ES DE $25000
                                           MUSICA ES DE $12000
                                           ATLETISMO ES DE $13000
                                           """);
        double total=189000;
        short porce=100;
        int Taller = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA EL NUMERO QUE PERTENESES AL TALLER"));
        float por ;
        if (Taller==1){
            por = (float)((9000/total)*porce);
            JOptionPane.showMessageDialog(null,"EL MONTO REPRESENTA EL " +por+"% DEL TOTAL");
        }
        else if (Taller==2){
            por = (float)((15000/total)*porce);
            JOptionPane.showMessageDialog(null,"EL MONTO REPRESENTA EL " +por+"% DEL TOTAL");
        }
        else if (Taller==3){
            por = (float)((50000/total)*porce);
            JOptionPane.showMessageDialog(null,"EL MONTO REPRESENTA EL " +por+"% DEL TOTAL");
        }
        else if (Taller==4){
            por = (float)((25000/total)*porce);
            JOptionPane.showMessageDialog(null,"EL MONTO REPRESENTA EL " +por+"% DEL TOTAL");
        }
        else if (Taller==5){
            por = (float)((50000/total)*porce);
            JOptionPane.showMessageDialog(null,"EL MONTO REPRESENTA EL " +por+"% DEL TOTAL");
        }
        else if (Taller==6){
            por = (float)((25000/total)*porce);
            JOptionPane.showMessageDialog(null,"EL MONTO REPRESENTA EL " +por+"% DEL TOTAL");
        }
        else if (Taller==7){
            por = (float)((12000/total)*porce);
            JOptionPane.showMessageDialog(null,"EL MONTO REPRESENTA EL " +por+"% DEL TOTAL");
        }
        else if (Taller==8){
            por = (float)((13000/total)*porce);
            JOptionPane.showMessageDialog(null,"EL MONTO REPRESENTA EL " +por+"% DEL TOTAL");
        }
        else{
            JOptionPane.showMessageDialog(null,"EL NUEMRO DEL TALLER NO ESTA REGISTRADO INTENTALO DE NUEVO");
        }
    }
    
}
    
