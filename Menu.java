package Principal;
import javax.swing.JOptionPane;
import Primeroparte.*;

public class Menu {
    public static void main(String[] args) {
        
        //declaracion de variables
        byte seleccion, x;
        
        //creacion de objetos
        Numeros obj1 = new Numeros();
        Comparacion obj2 = new Comparacion();
        Hipotenusa obj3 = new Hipotenusa();
        RadiYVolumen obj4 = new RadiYVolumen();
        par_o_inpar obj5 = new par_o_inpar();
        Notas obj6 = new Notas();
        COLOR obj7 = new COLOR();
        TALLER obj8 = new TALLER();
        java obj9 = new java();
        Dowhile obj10 = new Dowhile();
        Factorial obj11 = new Factorial();
        Tabla2 obj12 = new Tabla2();
        Navidad obj13 = new Navidad();
        Arreglo obj14 = new Arreglo();
        multi obj15 = new multi();
        
        do{//Creacion de un ciclo
            //mensaje del menu
        JOptionPane.showMessageDialog(null,"""
                                           1.-Cual es el mayor de 2 numeros
                                           2.-Cual es en mayor de tres numeros
                                           3.-El valor de la hipotenusa
                                           4.-Saber el area y el volumen de un cilindro
                                           5.-Conoser si un numero es par o no
                                           6.-Conocer la nota mediante e puntaje
                                           7.-Concurso de la cafeteria
                                           8.-Conocer sobre los talleres
                                           9.-Saber el area de 3 figuras distintas
                                           10.-Saber tu imc
                                           11.-El factorial de un numero
                                           12.-Conocer las tablas de multiplicar
                                           13.-Ver un arbolito con asteriscos
                                           14.-Conocer tu clificacion de cada materia
                                           15.-Una multiplicacion de dos tablas
                                           """);
        //mensaje de opcion del menu
        seleccion = Byte.parseByte(JOptionPane.showInputDialog("Ingresa un numero que deseas realizar la accion"));
        //creacion del selector
        switch(seleccion){
            case 1:
                obj1.par1();
                break;
            case 2:
                obj2.par2();
                break;
            case 3:
                obj3.par3();
                break;
            case 4:
                obj4.par4();
                break;
            case 5:
                obj5.par5();
                break;
            case 6:
                obj6.par6();
                break;
            case 7:
                obj7.par7();
                break;
            case 8:
                obj8.par8();
                break;
            case 9:
                obj9.par9();
                break;
            case 10:
                obj10.par10();
                break;
            case 11:
                obj11.par11();
                break;
            case 12:
                obj12.par12();
                break;
            case 13:
                obj13.par13();
                break;
            case 14:
                obj14.par14();
                break;
            case 15:
                obj15.par15();
                break;
            default:
            JOptionPane.showMessageDialog(null,"Lo sentimos solo puedes elegir del 1 al 15 vuelva a repetir");
            }//cierre del switch
        x=Byte.parseByte(JOptionPane.showInputDialog("Digite 1 si dese volver a realizar el programa "
                + "\n si no digite otro numero"));//eleccion de reinicio
        }while(x==1);//cierre del ciclo do
    }//cierre de la clase
}
