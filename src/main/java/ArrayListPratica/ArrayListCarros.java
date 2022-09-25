package ArrayListPratica;

import javax.swing.*;
import java.util.ArrayList;

public class ArrayListCarros {
    public static void main(String[] args) {
        //cria arraylist para carros
        ArrayList<String> carros = new ArrayList<>();
        //adiciona carros
        carros.add("FLUENCE");
        carros.add("KOMBI");
        carros.add("JAGUAR");
        carros.add("MERCEDES");
        carros.add("FUSCA");
        carros.add("VECTRA");
        carros.add("BMW");
        carros.add("SANDERO");
        //printa o arraylist
        System.out.println(carros.size());

        //Troca SANDERO por HONDA
        carros.set(7, "HONDA");
        System.out.println(carros);

        //remover VECTRA
        carros.remove("VECTRA");
        System.out.println(carros);

        //adiciona carro com joptionPane
        carros.add(JOptionPane.showInputDialog("Digite um carro"));
        System.out.println(carros);

        //limpar o arraylist
//        carros.clear();
//        System.out.println(carros);

        //verifica se esta vazio
//        if (carros.isEmpty()) {
//            System.out.println("Esta vazio");
//        }
            //substitui quando nao se sabe a posicao
        if (carros.contains("BMW")){
            for(int i = 0; i < carros.size(); i++){
                if ("BMW".equals(carros.get(i))){
                    carros.set(i, "BUGATTI");
                    break;
                }
            }

        }
        System.out.println(carros);










    }
}
