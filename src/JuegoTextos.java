public class JuegoTextos {

    public static int getSumaTexto(String texto) {

        int suma = 0;

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            String temporal = String.valueOf(letra);

            int numero = Integer.parseInt(temporal);

            suma += numero;

        }

        return suma;

    }

    public static boolean validarISBN(String isbn) {
       
        int suma = 0;

        for (int i = 0; i < isbn.length(); i++) {

            char letra = isbn.charAt(i);

            String temporal = String.valueOf(letra);

            int numero = Integer.parseInt(temporal);

            int multiplicacion = numero * (i + 1);

            suma += multiplicacion;

        }

       
        if (suma % 11 == 0) {
           return true; 
        } else {
           return false;
        }
      
    }
}
