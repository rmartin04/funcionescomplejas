public class HerramientasNumeros {

    public static void mostrarCollatz(int numero){

        while(numero != 1){
            if(numero % 2 == 0){
                numero = numero/2;
            }else{
                numero = numero * 3 + 1;

            }
            System.out.println(numero);
        }
    }

}
