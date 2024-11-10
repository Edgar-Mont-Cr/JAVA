package Selectiva_Swing;
import javax.swing.JOptionPane;

/**
 *
 * @author aspire
 */
public class java {
    public static void main (String[] edgar){
        //declaracion de variablas
        byte opcion;
        double a;
        short b;
        short h;
        double r;
        
        a = 0;
        opcion=Byte.parseByte(JOptionPane.showInputDialog("""
                                                          MENU DE OPCIONES
                                                          1.- TRIANGULO
                                                          2.- RECTANGULO
                                                          3.- CIRCULO
                                                          ESCRIBE EL NUMERO DE TU ELECCION
                                                          """));//ELECCION DE FIGURA
        switch(opcion){//REALIZACION DE OPERACIONES
            case 1 :
                h = Short.parseShort(JOptionPane.showInputDialog("ingresa la altura"));
                b = Short.parseShort(JOptionPane.showInputDialog("ingres el valor de la base"));
                a=(b+h)/2;
                break;
            case 2 :
                h = Short.parseShort(JOptionPane.showInputDialog("ingresa la altura"));
                b = Short.parseShort(JOptionPane.showInputDialog("ingres el valor de la base"));
                a=b*h;
                break;
            case 3 :
                h = Short.parseShort(JOptionPane.showInputDialog("ingresa la altura"));
                r = Double.parseDouble(JOptionPane.showInputDialog("ingresa el valor del radio"));
                a= (2* Math.PI/ r*h);
                break;
            default:
                JOptionPane.showMessageDialog(null,"solo puedes selecionar hasta 1, 2, 3 \n intente nuevamente" );
                //IMPRIMIR EL RESULTADO
        }
        
        JOptionPane.showMessageDialog(null,"EL RESULTADO ES " + a);
    }//cieere del metodo main
}//cierre de la clase
