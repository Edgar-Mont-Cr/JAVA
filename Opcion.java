/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author aspire
 */
public class Opcion {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"""
                                           ELIGE UNA OPCION DE ESTOS
                                           1.-AREA y VOLUMEN
                                           2.-FACTORIAL
                                           3.-IMC
                                           """); 
        byte a=Byte.parseByte(JOptionPane.showInputDialog(null, "ingresa un numero"));
        switch (a){
            case 1 :
                int R = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor del radio"));
                int H = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa el valor de la altura"));
        
                double volumen;
                double area;
                volumen = (double)(Math.PI * (Math.pow(R, 2) * H));
                area = (double)(2*Math.PI * R * H);
                System.out.println("el area es " + area + " y el volumen es de " + volumen );
                break;
            case 2:
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
                break;
            case 3:
                int peso;
                num = Integer.parseInt(JOptionPane.showInputDialog(null,"ingresa cuantas veces vas a hacer el registro"));
                float estatura, imc;
                int resp= 0;
                for (resp = 0; resp < num; resp++) {
                    peso = Integer.parseInt(JOptionPane.showInputDialog("captura tu peso"));
                    estatura = Float.parseFloat(JOptionPane.showInputDialog("captura tu estatura con formato de metros"));
                    imc = (peso/(estatura*estatura));
                    if (imc<18.29){
                        JOptionPane.showMessageDialog(null,"peso bajo");
                    }
                    else if (imc>=18.50 && imc <= 24.99){
                        JOptionPane.showMessageDialog(null, "peso normal");
                    }
                    else if (imc>=25 && imc <=29.99){
                        JOptionPane.showMessageDialog(null,"sobrepeso");
                    }
                    else if (imc>=30 && imc<=34.99){
                        JOptionPane.showMessageDialog(null,"obesidad leve");
                    }
                    else if (imc>=35 && imc<=39.99){
                        JOptionPane.showMessageDialog(null,"obesidad media");
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"obesidad morbida");
                    }
                }
                break;
            default:
                JOptionPane.showMessageDialog(null,"SOLO PUEDES ELEGIR DEL 1 AL 3 INTENTLO DE NUEVO");
        }
                
    }
}
