import javax.swing.JOptionPane;
public class multi {
    public static void main(String[] edgar) {
        //declaracion de variables
        short multi[][]=new short [3][3];
        byte ta1[][]=new byte [3][3];
        byte ta2[][]=new byte [3][3];
        byte m,y;
        
        //ingresion de datos
        for (byte i = 0; i < ta1.length; i++) {
            for (int j = 0; j < ta1.length; j++) {
                ta1[i][j]=Byte.parseByte(JOptionPane.showInputDialog(null,"ingresa tu numero de la tabla 1"));
            }
            for (int l = 0; l < ta2.length; l++) {
                ta2[i][l]=Byte.parseByte(JOptionPane.showInputDialog(null,"ingresa tu numero de la tabal 2"));
            }
        }
        
        //multiplicacion de variables
        m=2;
        y=2;
        for (int l = 0; l < ta1.length; l++) {
            for (int i = 0; i < ta1.length; i++) {
                multi[l][i]=(short)(ta1[l][i]*ta2[m-l][y-i]);
            }
        }
        
        //impresion de valores
        System.out.print(" -------------------\t\t");
        System.out.print(" -------------------\t\t");
        System.out.print(" --------------------");
        System.out.println();
        for (int i = 0; i < ta1.length; i++) {
            for (int j = 0; j < ta1.length; j++) {
                System.out.print(" | " + ta1[i][j] + " | ");
            }
            System.out.print("\t\t");
            for (int j = 0; j < ta2.length; j++) {
                System.out.print(" | " + ta2[i][j] + " | ");
            }
            System.out.print("\t\t");
            for (int p = 0; p < ta2.length; p++) {
                System.out.print(" | " + multi[i][p] + " | ");
            }
            System.out.println();
            System.out.print(" -------------------\t\t");
            System.out.print(" -------------------\t\t");
            System.out.print(" ----------------------");
            System.out.println();
        }
        System.out.println();
    }
}    
