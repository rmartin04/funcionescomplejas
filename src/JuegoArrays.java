public class JuegoArrays {

    public static void sumarNumerosArray(int[]numeros){

       // int [] numerosArray ={2,4,6,8,10};
        int suma = 0;
        for(int i = 0; i < numeros.length;i++){

            suma += numeros[i];

        }
         
        System.out.println("La suma de los valores del array es: "+suma);
        


    }

}
