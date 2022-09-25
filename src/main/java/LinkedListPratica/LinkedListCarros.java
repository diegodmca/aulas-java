package LinkedListPratica;

import java.util.LinkedList;

public class LinkedListCarros {
    public static void main(String[] args) {

        LinkedList<String> carros = new LinkedList<>();
        carros.add("Volvo");
        carros.add("BMW");
        carros.add("Ford");
        System.out.println(carros);

        //inserir no inicio
        carros.addFirst("Mazda");
        //inserir no fim
        carros.addLast("Bugatti");
        System.out.println(carros);

        String car;
        car = carros.get(3);
        System.out.println(car);

        //remove mazda
        carros.remove("Mazda");
        System.out.println(carros);

        //pega o primeiro e ultimo
        System.out.println(carros.getFirst());
        System.out.println(carros.getLast());

        //limpa tudo
        carros.remove();
        System.out.println(carros);










    }
}
