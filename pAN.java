import javax.swing.JOptionPane;
public class pAN {
public static void main(String[]args){
System.out.println("introduce un numero");
short n= Short.parseShort(JOptionPane.showInputDialog("ingresa un numero"));   
if (n%2 ==0){
System.out.println("el numero es par");
}else{
System.out.println("el numero es impar");
  }
 }
}
