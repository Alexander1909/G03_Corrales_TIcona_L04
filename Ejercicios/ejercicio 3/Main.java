package ejercicio 3;

public class Main {
     // Método para mostrar la matriz de costos
     public static void mostrarMatriz(int[][] M) {
        for (int[] fila : M) {
            for (int valor : fila) {
                if (valor == Integer.MAX_VALUE) {
                    System.out.print("INF "); // Imprimimos INF si no hay camino
                } else {
                    System.out.print(valor + " ");
                }
}
