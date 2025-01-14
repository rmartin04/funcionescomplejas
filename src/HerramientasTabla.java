public class HerramientasTabla {

    public static void mostrarTablaMultiplicar(int numero){
        
        for (int i = 1; i <= 10; i++){
          
            System.out.println(getMensajeTabla(numero, i, " * "));
            System.out.println(getMensajeTabla(numero, i, " x "));
            System.out.println(getMensajeTabla(numero, i, " por "));

              
        }
    }

    private static String getMensajeTabla (int num, int multiplicador, String separador){
      
        int operacion = num * multiplicador;

        return num + separador + multiplicador + " = " + operacion;
    }
}
