package Generics.Embarque;

import Generics.Controle.Aeronaves;

import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Aeronaves aero = new Aeronaves();
        System.out.println("Informe o nr de aeronaves");
        int nrAeronaves = input.nextInt();

        //adicionar voos

        for ( int i = 0; i < nrAeronaves; i++){
            int nrVoo = input.nextInt();
            aero.addVoo(nrVoo);
        }

        System.out.println("O primeiro a decolar vai ser o nr: " + aero.primeiroVoo());
        aero.listaVoos();
        input.close();


    }


}
