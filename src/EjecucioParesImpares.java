import java.util.Scanner;
public class EjecucioParesImpares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Programa Pares e Impares");
        System.out.println("Introduzca el numero de inicio");

        String entrada = teclado.nextLine();
        int inicio = Integer.parseInt(entrada);

        System.out.println("Introduzca el numero final ");
        entrada = teclado.nextLine();
        int fin = Integer.parseInt(entrada);

        ClaseParesImpares.getRangoNumeros(inicio,fin,true);
        ClaseParesImpares.getRangoNumeros(inicio,fin,false);
    }
}
