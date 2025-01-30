package plan;
import javax.swing.JOptionPane;
public class yu {
    public static void main(String[] args) {
        byte x;
        int v;
        
        JOptionPane.showMessageDialog(null,"HOLA BIENBENIDO AL PARQUE ACUATICO");
        v = Integer.parseInt(JOptionPane.showInputDialog(null,"INGRESA TU ALTURA"));
        
        if (v >= 160) {
            JOptionPane.showMessageDialog(null,"FELICIDADES PUEDES SUBIR \n A LA MAYORIA DE ATRACCIONES");
        }
        else {
            JOptionPane.showMessageDialog(null,"LO SIENTO SOLO PUEDES SUBIER \n A UNAS POCAS ATRACCIONES");
        }
    }
}
