package ejercicio 2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSelect {

    // Método principal que busca el k-ésimo menor elemento
    public static int quickSelect(List<Integer> arr, int k) {

        // Caso base: si solo queda un elemento, ese es el resultado
        if (arr.size() == 1) {
            return arr.get(0);
        }
        // Elegimos un pivote al azar
        Random rand = new Random();
        int pivot = arr.get(rand.nextInt(arr.size()));

        // Creamos tres listas para dividir los números
        List<Integer> menores = new ArrayList<>();
        List<Integer> iguales = new ArrayList<>();
        List<Integer> mayores = new ArrayList<>();

        // Clasificamos los elementos según el pivote
        for (int num : arr) {
            if (num < pivot) {
                menores.add(num);
            } else if (num > pivot) {
                mayores.add(num);
            } else {
                iguales.add(num);
            }
        }
        // Verificamos en qué grupo está el k-ésimo menor
        if (k <= menores.size()) {
            return quickSelect(menores, k);
        } else if (k <= menores.size() + iguales.size()) {
            return pivot;
        } else {
            int nuevoK = k - menores.size() - iguales.size();
            return quickSelect(mayores, nuevoK);
        }
    }