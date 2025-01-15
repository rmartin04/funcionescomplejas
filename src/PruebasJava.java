
import java.util.Scanner;

public class PruebasJava {

    public static void main(String[] args) {

        String narcisista ="156";

   
        int suma = 0;

        for (int i = 0; i < narcisista.length(); i++) {

            char letra = narcisista.charAt(i);

            String temporal = String.valueOf(letra);

            int numero = Integer.parseInt(temporal);

            double potencia = Math.pow(numero,narcisista.length());

            suma += potencia;

        }
       
        String suma2 = String.valueOf(suma);
        if(narcisista.equals(suma2)){
            System.out.println("El numero "+ narcisista + " es narcisista");

        }else{
            System.out.println("El numero "+ narcisista + " no es narcisista ");
        }
    }
}
