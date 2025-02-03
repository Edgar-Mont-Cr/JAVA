package plan;

import javax.swing.JOptionPane;

public class pla {
    public static void main(String[] args) {
        byte x;
        
        x = Byte.parseByte(JOptionPane.showInputDialog("""
                                                       HOLA Y BIENEVENIDO A LA SUCURSAL DE VIAJES
                                                       POR FAVOR SELECCIONE A DONDE SE DIRIGE
                                                       1.-LA PLAYA
                                                       2.-EL BOSQUE
                                                       3.-UN LUGAR TURISTICO
                                                       """));
        switch  (x){
            case 1:
                JOptionPane.showInternalMessageDialog(null,"GRACIAS POR ELEGIRNOS \n "
                        + "EL COSTE (YODO INCLUIDO) ES DE $12,000 \n "
                        + "DISFUITE DE SU VIAJE");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"PAR FAVOR SIGA LAS INDICACIONES DEL GUARDABOSUQES \n "
                        + "");
                break;
            case 3:
                break;
            default:
                
                
        }
    }
}
