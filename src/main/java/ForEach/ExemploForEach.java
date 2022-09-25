package ForEach;

public class ExemploForEach {
    public static void main(String[] args) {
        int[] vetorNumeros = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Varrendo o vetor sem For Each");
        for (int i = 0; i < vetorNumeros.length; i++){
            System.out.println("Nr: " + vetorNumeros[i]);
        }

        //usando o ForEach
        System.out.println("ForEach abaixo");
        for (int listaNumeros : vetorNumeros) {
            System.out.println("Nr : " + listaNumeros);
        }
    }
}
