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
     // Paso 2: Buscamos si es más barato ir haciendo escalas

     for (int i = n - 2; i >= 0; i--) { // Empezamos desde el penúltimo embarcadero

        for (int j = i + 1; j < n; j++) { // Solo miramos hacia adelante

            for (int k = i + 1; k < j; k++) { // k es el punto intermedio (escala)

                // Solo si hay camino válido
                if (T[i][k] != Integer.MAX_VALUE && C[k][j] != Integer.MAX_VALUE) {
                    int costoConEscala = T[i][k] + C[k][j];
                    C[i][j] = Math.min(C[i][j], costoConEscala);
                }
            }
        }
    }

    return C; // Devolvemos la matriz con los costos más bajos entre todos los puntos
}
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
        }
    } 
}




