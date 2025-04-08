package ejercicio 3;
public class ViajeMasBarato {
// Este método calcula la matriz de costos mínimos
public static int[][] calcularCostosMinimos(int[][] T) {
    int n = T.length; // Número de embarcaderos
    int[][] C = new int[n][n]; // Matriz de costos mínimos

    // Paso 1: Copiamos los costos directos de T a C
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == j) {
                C[i][j] = 0;
            } else if (i < j) {
                C[i][j] = T[i][j]; // Copiamos el costo directo (si existe)
            } else {
                C[i][j] = Integer.MAX_VALUE; // No se puede ir hacia atrás en el río
            }
        }
    }


