
import java.util.Scanner;



public class EjecucionTextos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

             System.out.println("Introduzca un texto numerico ");

                 String texto = teclado.nextLine();

                     System.out.println(texto);
        
                int resultado = JuegoTextos.getSumaTexto(texto);

             System.out.println( "La suma de los numeros del texto es " + resultado);
             System.out.println("\n");

             System.out.println("///////////////////////////////////////////////////");
             System.out.println("\n");

            System.out.println("Introduzca un código ISBN ");

            String isbn = teclado.nextLine();
                System.out.println("Ha introducido el código ISBN : " + isbn);

                boolean valido = JuegoTextos.validarISBN(isbn);
                if(valido == true){
                    System.out.println("El código introducido es correcto ");
                }else{
                    System.out.println("El código introducido no es correcto ");
                }

                //System.out.println(valido);
    }
}
