package Principal;
import javax.swing.JOptionPane;
import primerproyecto.*;

public class Menu {
    //metodo principal
    public static void main(String[] args) {
        //atributo
        int x;
        //Declaracion de variables
        byte seleccion,a,b,c;
        String nom;
        hola obj1 = new hola();
        
        seleccion = Byte.parseByte(JOptionPane.showInputDialog(null,"Selecciona el numero que corresponda a su seleccion"));
        switch(seleccion){
            case 1:
                obj1.ji();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default :
                
        }
        nom=JOptionPane.showInputDialog("ingresa tu nombre complesto");
        /*crear objeto
        nombres de la clase,identificador del objeto,igual,new,contructor
        -nombreclase 
        clase que contiene el metodo que quiero invocar
        -identificadorObjeto
        es el nombre del objeto en minusculas
        -new
        sirve para indicar que un nuevo objeto y que se reserva un espacio en memoria para el mismo
        -constructor
        es un metodo especial que lleva el mismo nombre de la clase que contiene al metodo que mandare llamar 
            y se colocan parentesis.
        */
        
        Menu objeto = new Menu();
        //invocar metodo
        
        objeto.registroDatos(nom);
        //crear un objeto 
        Cinco objeto1 = new Cinco();
        
                   
    /* segudo metodo SINTAXIS
    modificadoAcceso tipoRetorno identificador (lista de oarametros)
donde:
    modificadorAcceso puede se r:publico amigable private o protegido
    tipo de retorno pueden ser byte short int long float double boolean char
                                        String
                                        void(sin tipo de retorno)
    identificador (nobre del metodo) inicia con mayuscula nomenglatura de camel __sin espacios 
    lista de parametros \tipoDato identificador por cada unon d eellos
                        ejemplo (byte x; byte y)
    */
    }//cirre el metodo principal
    
    public void imprimirMensaje(){
        System.out.println("estamos a pundo de concluir el primer srmestre ya eres programadores");
    }
    public void registroDatos(String nombre){
        System.out.println("bienvenido " + nombre);
        imprimirMensaje();
    }
    
}