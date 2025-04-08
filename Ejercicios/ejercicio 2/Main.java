package ejercicio 2;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = List.of(4, 2, 7, 10, 4, 17);
        System.out.println("Resultado: " + quickSelect(new ArrayList<>(lista1), 3));  // Esperado: 4

        List<Integer> lista2 = List.of(4, 2, 7, 10, 4, 1, 6);
        System.out.println("Resultado: " + quickSelect(new ArrayList<>(lista2), 5));  // Esperado: 6
        List<Integer> lista3 = List.of(4, 2, 7, 1, 4, 6);
        System.out.println("Resultado: " + quickSelect(new ArrayList<>(lista3), 1));  // Esperado: 1

        List<Integer> lista4 = List.of(9, 2, 7, 1, 7);
        System.out.println("Resultado: " + quickSelect(new ArrayList<>(lista4), 4));  // Esperado: 7
    }
}

