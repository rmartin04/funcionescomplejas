public class ClaseParesImpares {

    private static void getNumerosPares(int inicio, int fin) {

        for (int i = inicio; i <= fin; i++) {

            if (i % 2 == 0) {
                System.out.println("par : " + i);
            }

        }

    }

    private static void getNumerosImpares(int inicio, int fin) {

        for (int i = inicio; i <= fin; i++) {

            if (i % 2 != 0) {
                System.out.println("impar : " + i);
            }

        }

    }

    public static void getRangoNumeros(int inicio,int fin, boolean pares){
        if(pares == true){
            getNumerosPares(inicio,fin);
        }else{
            getNumerosImpares(inicio, fin);
        }
    }


}
