public class Tabla2 {
        public static void main(String[] args) {
        
            for (int i = 1;  i<= 10; i++) {
                System.out.print("Tabla del: " + i + "\t");
            }
            
            System.out.println();
            for (int j = 1; j <= 10; j++) {                 
                for (int i = 1; i <= 10; i++) { 
                    System.out.print(i + " * " + j + " = " + (i * j) + "\t"); 
                }
                System.out.println(); 
            }    
        }
}
