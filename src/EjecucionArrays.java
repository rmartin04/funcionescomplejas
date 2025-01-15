import java.util.Scanner;

public class EjecucionArrays {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int []numeros = JuegoArrays.getArrayRandom(6);

        System.out.println("Los valores el array son :");
       
        for (int valores : numeros) {

        System.out.println(valores);

        }
      
       

        int suma = JuegoArrays.sumarNumerosArray(numeros);
        System.out.println("La suma de los valores del array es : " + suma);

    }

}
