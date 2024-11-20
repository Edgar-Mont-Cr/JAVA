import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class Factorial {
    public static void main(String[] args){
        int num;
        int fact;
        byte opcion;
        int x;
        
        do { 
            fact=1;
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa un numero"));
            for(x=num;x>=1;x--){            
            fact*=x;
        }           
        JOptionPane.showMessageDialog(null, "El fctorial de "+ num +" es:" + fact );
        opcion = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese"
                + " 1 si desea volver a hacer otra operacion (digite otro numero si no)"));
        } while (opcion == 1);
    }
    
}
