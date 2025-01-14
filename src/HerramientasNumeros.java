public class HerramientasNumeros {

    public static void mostrarCollatz(int numero) {

        while (numero != 1) {

           // String mensaje = getMensajeCollatz(numero);

           // System.out.println(mensaje);
            int num = getNumeroCollatz(numero);
            numero =num;
            System.out.println(num);
        }
    }

    private static String getMensajeCollatz(int numero) {
        String mensaje = "";

        if (numero % 2 == 0) {
            numero = numero / 2;
            mensaje = "Par : " + numero;
        } else {
            numero = numero * 3 + 1;
            mensaje = "Impar : " + numero;
            
        }
        return mensaje;
    }

    
    private static int getNumeroCollatz(int numero) {
        String mensaje = "";

        if (numero % 2 == 0) {
            numero = numero / 2;
           
        } else {
            numero = numero * 3 + 1;
           
            
        }
        return numero;
    }
}
