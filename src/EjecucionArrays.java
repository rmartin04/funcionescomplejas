import java.util.Scanner;

public class EjecucionArrays {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

       

        int[] numerosArray = new int[3];

        for (int i = 0; i < numerosArray.length; i++) {

           // System.out.println("Introduzca el valor para la posicion :" + i);

            numerosArray[i] = (int)(Math.random()*100);

        }
         for (int valores : numerosArray) {
             System.out.println(valores);
         }

        int suma = JuegoArrays.sumarNumerosArray(numerosArray);
        System.out.println("La suma de los valores del array es : " + suma);

    }

}
