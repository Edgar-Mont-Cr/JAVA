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
                JOptionPane.showInternalMessageDialog(null,"");
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                
                
        }
    }
}
