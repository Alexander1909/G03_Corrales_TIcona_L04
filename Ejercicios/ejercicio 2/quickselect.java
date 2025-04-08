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