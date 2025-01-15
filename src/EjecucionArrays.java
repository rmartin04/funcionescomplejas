import java.util.Scanner;


public class EjecucionArrays {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int [] numerosArray ={5,10,15};
        int suma = 0;
        for(int i = 0; i < numerosArray.length;i++){

            suma += numerosArray[i];

        }
         
        System.out.println(suma);
      
    }


}
