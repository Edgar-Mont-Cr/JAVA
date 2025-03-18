package poo;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class Estudiante {
    //atributo se definen fuerade los metodos, lleva modificadores de acceso
    public int atributo1;
    private int atributo2;
    protected int atributo3;
    int atributo4;
    private JButton aceptar;
    //modificador  tipo de dato  nombre
    
    public Estudiante(){
        aceptar = new JButton("ACEPTAR");
    }
    //metodo
    public byte suma(byte a,byte b){
        byte suma;
        suma=(byte)(a+b);
        return suma;
    }
    void solicitudDatos(){
        byte x,y;
        x=Byte.parseByte(JOptionPane.showInputDialog(null,"ingresa un nuemro"));
        y=Byte.parseByte(JOptionPane.showInputDialog(null,"ingresa otro numero"));
        //objeto
        suma(x,y);
    }
    
    //metodo principal
    public static void main(String[] args) {
        Estudiante ob1 = new Estudiante();
        ob1.atributo1();        
    }
}


class Clase2{
    
}
