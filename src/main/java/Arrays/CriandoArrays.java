package Arrays;

import javax.swing.*;

public class CriandoArrays {
    public static void main(String[] args) {
       /* //array de teste inputando os valores diretamente
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int lista: array){
            System.out.println(lista);
        }
        //criando array de paises
        String[] paises = new String[4];

        //percorre cada slot do array e obtem os paises
        for(int i = 0; i < paises.length; i++){
            paises[i] = JOptionPane.showInputDialog("Informe um pais");
        }
        //percorre e mostra os valores no console
        for(String lista: paises){
            System.out.println(lista);
        }
*/
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero"));
        }

        for (int lista: numeros){
            System.out.println(lista);
        }
        int novoValor = 11;
        numeros[8] = novoValor + 4;
        //lista depois dos caulculos
        for (int listaNumeros: numeros){
            System.out.println(listaNumeros);
        }
    }


}
