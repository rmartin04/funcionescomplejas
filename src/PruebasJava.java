
import java.util.Scanner;

public class PruebasJava {

    public static void main(String[] args) {
        
       // Scanner teclado = new Scanner(System.in);

        String texto = "8441513929";
     
        int suma = 0; 

        for (int i = 0; i < texto.length(); i++){

            char letra = texto.charAt(i);

            String temporal = String.valueOf(letra);

            int numero = Integer.parseInt(temporal);

            int  multiplicacion = numero * (i+1);

             suma += multiplicacion;

    }
    
        boolean resultado ;
        if (suma % 11 == 0){
            resultado = true;
            System.out.println("El codigo ISBN es correcto ");
        }else {
            resultado = false;
            System.out.println("El codigo ISBN no es correcto ");
        }
}
}
