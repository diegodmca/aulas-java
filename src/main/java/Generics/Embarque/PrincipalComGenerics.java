package Generics.Embarque;
import java.util.Scanner;

import Generics.Controle.AeronavesComGenerics;
public class PrincipalComGenerics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        AeronavesComGenerics<Integer> air = new AeronavesComGenerics<>();
        System.out.println("Informe o nr de aeronaves");
        int nrAeronaves = sc.nextInt();

        //adicionando voos
        for (int i = 0; i < nrAeronaves; i++) {
            Integer nrVoo = sc.nextInt();
            air.addVoo(nrVoo);
        }
        air.primeiroVoo();
        Integer x = air.primeiroVoo();
        System.out.println("O primeiro voo a decolar:" + x);
        air.listaVoos();
        sc.close();
    }
}